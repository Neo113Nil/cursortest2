package com.bumptech.glide.util;

import android.os.SystemClock;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import com.google.android.play.core.splitinstall.internal.zzb;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class LruCache implements zzb {
    public Object cache;
    public long currentSize;
    public long maxSize;

    public final class Entry {
        public final int size;
        public final Object value;

        public Entry(Object obj, int i) {
            this.value = obj;
            this.size = i;
        }
    }

    public LruCache(long j) {
        this.cache = new LinkedHashMap(100, 0.75f, true);
        this.maxSize = j;
    }

    public synchronized Object get(Object obj) {
        Entry entry;
        entry = (Entry) ((LinkedHashMap) this.cache).get(obj);
        return entry != null ? entry.value : null;
    }

    public int getSize(Object obj) {
        return 1;
    }

    public void onItemEvicted(Object obj, Object obj2) {
    }

    public synchronized Object put(Object obj, Object obj2) {
        int size = getSize(obj2);
        long j = size;
        if (j >= this.maxSize) {
            onItemEvicted(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.currentSize += j;
        }
        Entry entry = (Entry) ((LinkedHashMap) this.cache).put(obj, obj2 == null ? null : new Entry(obj2, size));
        if (entry != null) {
            this.currentSize -= entry.size;
            if (!entry.value.equals(obj2)) {
                onItemEvicted(obj, entry.value);
            }
        }
        trimToSize(this.maxSize);
        return entry != null ? entry.value : null;
    }

    public void throwExceptionIfDeadlineIsReached(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.cache) == null) {
            this.cache = exc;
        }
        if (this.maxSize == -9223372036854775807L && DefaultAudioSink.pendingReleaseCount.get() <= 0) {
            this.maxSize = 200 + elapsedRealtime;
        }
        long j = this.maxSize;
        if (j == -9223372036854775807L || elapsedRealtime < j) {
            this.currentSize = elapsedRealtime + 50;
            return;
        }
        Exception exc2 = (Exception) this.cache;
        if (exc2 != exc) {
            exc2.addSuppressed(exc);
        }
        Exception exc3 = (Exception) this.cache;
        this.cache = null;
        this.maxSize = -9223372036854775807L;
        this.currentSize = -9223372036854775807L;
        throw exc3;
    }

    public synchronized void trimToSize(long j) {
        while (this.currentSize > j) {
            Iterator it = ((LinkedHashMap) this.cache).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Entry entry2 = (Entry) entry.getValue();
            this.currentSize -= entry2.size;
            Object key = entry.getKey();
            it.remove();
            onItemEvicted(key, entry2.value);
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public long zza() {
        return this.currentSize;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzb
    public void zzb(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = ((FileChannel) this.cache).map(FileChannel.MapMode.READ_ONLY, this.maxSize + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public LruCache(FileChannel fileChannel, long j, long j2) {
        this.cache = fileChannel;
        this.maxSize = j;
        this.currentSize = j2;
    }

    public LruCache() {
        this.maxSize = -9223372036854775807L;
        this.currentSize = -9223372036854775807L;
    }
}
