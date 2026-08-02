package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.android.volley.Cache$Entry;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import com.google.firebase.messaging.ByteStreams;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public final class DiskBasedCache {
    public final CallResult mRootDirectorySupplier;
    public final LinkedHashMap mEntries = new LinkedHashMap(16, 0.75f, true);
    public long mTotalSize = 0;
    public final int mMaxCacheSizeInBytes = 5242880;

    public DiskBasedCache(CallResult callResult) {
        this.mRootDirectorySupplier = callResult;
    }

    public static String getFilenameForKey(String str) {
        int length = str.length() / 2;
        StringBuilder m = Boxes$$ExternalSyntheticOutline1.m(String.valueOf(str.substring(0, length).hashCode()));
        m.append(String.valueOf(str.substring(length).hashCode()));
        return m.toString();
    }

    public static int read(ByteStreams.LimitedInputStream limitedInputStream) {
        int read = limitedInputStream.read();
        if (read != -1) {
            return read;
        }
        Path$$ExternalSyntheticBUOutline0.m$1();
        return 0;
    }

    public static int readInt(ByteStreams.LimitedInputStream limitedInputStream) {
        return (read(limitedInputStream) << 24) | read(limitedInputStream) | (read(limitedInputStream) << 8) | (read(limitedInputStream) << 16);
    }

    public static long readLong(ByteStreams.LimitedInputStream limitedInputStream) {
        return (read(limitedInputStream) & 255) | ((read(limitedInputStream) & 255) << 8) | ((read(limitedInputStream) & 255) << 16) | ((read(limitedInputStream) & 255) << 24) | ((read(limitedInputStream) & 255) << 32) | ((read(limitedInputStream) & 255) << 40) | ((read(limitedInputStream) & 255) << 48) | ((255 & read(limitedInputStream)) << 56);
    }

    public static String readString(ByteStreams.LimitedInputStream limitedInputStream) {
        return new String(streamToBytes(limitedInputStream, readLong(limitedInputStream)), "UTF-8");
    }

    public static byte[] streamToBytes(ByteStreams.LimitedInputStream limitedInputStream, long j) {
        long j2 = limitedInputStream.left - limitedInputStream.mark;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(limitedInputStream).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder m1149m = Boxes$$ExternalSyntheticOutline1.m1149m(j, "streamToBytes length=", ", maxLength=");
        m1149m.append(j2);
        throw new IOException(m1149m.toString());
    }

    public static void writeInt(BufferedOutputStream bufferedOutputStream, int i) {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void writeLong(BufferedOutputStream bufferedOutputStream, long j) {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void writeString(BufferedOutputStream bufferedOutputStream, String str) {
        byte[] bytes = str.getBytes("UTF-8");
        writeLong(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public final synchronized Cache$Entry get(String str) {
        CacheHeader cacheHeader = (CacheHeader) this.mEntries.get(str);
        if (cacheHeader == null) {
            return null;
        }
        File fileForKey = getFileForKey(str);
        try {
            ByteStreams.LimitedInputStream limitedInputStream = new ByteStreams.LimitedInputStream(new BufferedInputStream(new FileInputStream(fileForKey)), fileForKey.length());
            try {
                CacheHeader readHeader = CacheHeader.readHeader(limitedInputStream);
                if (TextUtils.equals(str, readHeader.key)) {
                    return cacheHeader.toCacheEntry(streamToBytes(limitedInputStream, limitedInputStream.left - limitedInputStream.mark));
                }
                VolleyLog.d("%s: key=%s, found=%s", fileForKey.getAbsolutePath(), str, readHeader.key);
                CacheHeader cacheHeader2 = (CacheHeader) this.mEntries.remove(str);
                if (cacheHeader2 != null) {
                    this.mTotalSize -= cacheHeader2.size;
                }
                return null;
            } finally {
                limitedInputStream.close();
            }
        } catch (IOException e) {
            VolleyLog.d("%s: %s", fileForKey.getAbsolutePath(), e.toString());
            synchronized (this) {
                boolean delete = getFileForKey(str).delete();
                CacheHeader cacheHeader3 = (CacheHeader) this.mEntries.remove(str);
                if (cacheHeader3 != null) {
                    this.mTotalSize -= cacheHeader3.size;
                }
                if (!delete) {
                    VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, getFilenameForKey(str));
                }
                return null;
            }
        }
    }

    public final File getFileForKey(String str) {
        return new File(this.mRootDirectorySupplier.get(), getFilenameForKey(str));
    }

    public final synchronized void initialize() {
        long length;
        ByteStreams.LimitedInputStream limitedInputStream;
        File file = this.mRootDirectorySupplier.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                VolleyLog.e("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                limitedInputStream = new ByteStreams.LimitedInputStream(new BufferedInputStream(new FileInputStream(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                CacheHeader readHeader = CacheHeader.readHeader(limitedInputStream);
                readHeader.size = length;
                putEntry(readHeader.key, readHeader);
                limitedInputStream.close();
            } catch (Throwable th) {
                limitedInputStream.close();
                throw th;
            }
        }
    }

    public final void pruneIfNeeded() {
        long j = this.mTotalSize;
        int i = this.mMaxCacheSizeInBytes;
        if (j < i) {
            return;
        }
        int i2 = 0;
        if (VolleyLog.DEBUG) {
            VolleyLog.v("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.mTotalSize;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.mEntries.entrySet().iterator();
        while (it.hasNext()) {
            CacheHeader cacheHeader = (CacheHeader) ((Map.Entry) it.next()).getValue();
            if (getFileForKey(cacheHeader.key).delete()) {
                this.mTotalSize -= cacheHeader.size;
            } else {
                String str = cacheHeader.key;
                VolleyLog.d("Could not delete cache entry for key=%s, filename=%s", str, getFilenameForKey(str));
            }
            it.remove();
            i2++;
            if (this.mTotalSize < i * 0.9f) {
                break;
            }
        }
        if (VolleyLog.DEBUG) {
            VolleyLog.v("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.mTotalSize - j2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    public final synchronized void put(String str, Cache$Entry cache$Entry) {
        BufferedOutputStream bufferedOutputStream;
        CacheHeader cacheHeader;
        long j = this.mTotalSize;
        byte[] bArr = cache$Entry.data;
        long length = j + bArr.length;
        int i = this.mMaxCacheSizeInBytes;
        if (length <= i || bArr.length <= i * 0.9f) {
            File fileForKey = getFileForKey(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileForKey));
                cacheHeader = new CacheHeader(str, cache$Entry);
            } catch (IOException unused) {
                if (!fileForKey.delete()) {
                    VolleyLog.d("Could not clean up file %s", fileForKey.getAbsolutePath());
                }
                if (!this.mRootDirectorySupplier.get().exists()) {
                    VolleyLog.d("Re-initializing cache after external clearing.", new Object[0]);
                    this.mEntries.clear();
                    this.mTotalSize = 0L;
                    initialize();
                }
            }
            if (!cacheHeader.writeHeader(bufferedOutputStream)) {
                bufferedOutputStream.close();
                VolleyLog.d("Failed to write header for %s", fileForKey.getAbsolutePath());
                throw new IOException();
            }
            bufferedOutputStream.write(cache$Entry.data);
            bufferedOutputStream.close();
            cacheHeader.size = fileForKey.length();
            putEntry(str, cacheHeader);
            pruneIfNeeded();
        }
    }

    public final void putEntry(String str, CacheHeader cacheHeader) {
        LinkedHashMap linkedHashMap = this.mEntries;
        if (linkedHashMap.containsKey(str)) {
            this.mTotalSize = (cacheHeader.size - ((CacheHeader) linkedHashMap.get(str)).size) + this.mTotalSize;
        } else {
            this.mTotalSize += cacheHeader.size;
        }
        linkedHashMap.put(str, cacheHeader);
    }

    public final class CacheHeader {
        public final List allResponseHeaders;
        public final String etag;
        public final String key;
        public final long lastModified;
        public final long serverDate;
        public long size;
        public final long softTtl;
        public final long ttl;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public CacheHeader(String str, Cache$Entry cache$Entry) {
            this(str, r2, r3, r5, r7, r9, r0);
            String str2 = cache$Entry.etag;
            long j = cache$Entry.serverDate;
            long j2 = cache$Entry.lastModified;
            long j3 = cache$Entry.ttl;
            long j4 = cache$Entry.softTtl;
            List list = cache$Entry.allResponseHeaders;
            if (list == 0) {
                Map map = cache$Entry.responseHeaders;
                list = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    list.add(new Header((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }

        public static CacheHeader readHeader(ByteStreams.LimitedInputStream limitedInputStream) {
            if (DiskBasedCache.readInt(limitedInputStream) != 538247942) {
                throw new IOException();
            }
            String readString = DiskBasedCache.readString(limitedInputStream);
            String readString2 = DiskBasedCache.readString(limitedInputStream);
            long readLong = DiskBasedCache.readLong(limitedInputStream);
            long readLong2 = DiskBasedCache.readLong(limitedInputStream);
            long readLong3 = DiskBasedCache.readLong(limitedInputStream);
            long readLong4 = DiskBasedCache.readLong(limitedInputStream);
            int readInt = DiskBasedCache.readInt(limitedInputStream);
            if (readInt < 0) {
                a$$ExternalSyntheticBUOutline0.m$4(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(readInt, "readHeaderList size="));
                return null;
            }
            List arrayList = readInt == 0 ? Collections.EMPTY_LIST : new ArrayList();
            for (int i = 0; i < readInt; i++) {
                arrayList.add(new Header(DiskBasedCache.readString(limitedInputStream).intern(), DiskBasedCache.readString(limitedInputStream).intern()));
            }
            return new CacheHeader(readString, readString2, readLong, readLong2, readLong3, readLong4, arrayList);
        }

        public final Cache$Entry toCacheEntry(byte[] bArr) {
            Cache$Entry cache$Entry = new Cache$Entry();
            cache$Entry.data = bArr;
            cache$Entry.etag = this.etag;
            cache$Entry.serverDate = this.serverDate;
            cache$Entry.lastModified = this.lastModified;
            cache$Entry.ttl = this.ttl;
            cache$Entry.softTtl = this.softTtl;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List<Header> list = this.allResponseHeaders;
            for (Header header : list) {
                treeMap.put(header.mName, header.mValue);
            }
            cache$Entry.responseHeaders = treeMap;
            cache$Entry.allResponseHeaders = Collections.unmodifiableList(list);
            return cache$Entry;
        }

        public final boolean writeHeader(BufferedOutputStream bufferedOutputStream) {
            try {
                DiskBasedCache.writeInt(bufferedOutputStream, 538247942);
                DiskBasedCache.writeString(bufferedOutputStream, this.key);
                String str = this.etag;
                if (str == null) {
                    str = "";
                }
                DiskBasedCache.writeString(bufferedOutputStream, str);
                DiskBasedCache.writeLong(bufferedOutputStream, this.serverDate);
                DiskBasedCache.writeLong(bufferedOutputStream, this.lastModified);
                DiskBasedCache.writeLong(bufferedOutputStream, this.ttl);
                DiskBasedCache.writeLong(bufferedOutputStream, this.softTtl);
                List<Header> list = this.allResponseHeaders;
                if (list != null) {
                    DiskBasedCache.writeInt(bufferedOutputStream, list.size());
                    for (Header header : list) {
                        DiskBasedCache.writeString(bufferedOutputStream, header.mName);
                        DiskBasedCache.writeString(bufferedOutputStream, header.mValue);
                    }
                } else {
                    DiskBasedCache.writeInt(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e) {
                VolleyLog.d("%s", e.toString());
                return false;
            }
        }

        public CacheHeader(String str, String str2, long j, long j2, long j3, long j4, List list) {
            this.key = str;
            this.etag = "".equals(str2) ? null : str2;
            this.serverDate = j;
            this.lastModified = j2;
            this.ttl = j3;
            this.softTtl = j4;
            this.allResponseHeaders = list;
        }
    }
}
