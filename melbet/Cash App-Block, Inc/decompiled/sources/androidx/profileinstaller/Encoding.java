package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.MemoryCacheService;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import org.apache.commons.imaging.formats.pnm.PnmConstants;

/* loaded from: classes3.dex */
public abstract class Encoding {
    public static final byte[] MAGIC_PROF = {112, 114, 111, 0};
    public static final byte[] MAGIC_PROFM = {112, 114, 109, 0};
    public static final byte[] V015_S = {48, PnmConstants.PBM_TEXT_CODE, PnmConstants.PGM_RAW_CODE, 0};
    public static final byte[] V010_P = {48, PnmConstants.PBM_TEXT_CODE, 48, 0};
    public static final byte[] V009_O_MR1 = {48, 48, 57, 0};
    public static final byte[] V005_O = {48, 48, PnmConstants.PGM_RAW_CODE, 0};
    public static final byte[] V001_N = {48, 48, PnmConstants.PBM_TEXT_CODE, 0};
    public static final byte[] METADATA_V001_N = {48, 48, PnmConstants.PBM_TEXT_CODE, 0};
    public static final byte[] METADATA_V002 = {48, 48, PnmConstants.PGM_TEXT_CODE, 0};

    public static byte[] compress(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static byte[] createCompressibleBody(DexProfileData[] dexProfileDataArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (DexProfileData dexProfileData : dexProfileDataArr) {
            i2 += ((((dexProfileData.numMethodIds * 2) + 7) & (-8)) / 8) + (dexProfileData.classSetSize * 2) + generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + dexProfileData.hotMethodRegionSize;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i2);
        if (Arrays.equals(bArr, V009_O_MR1)) {
            int length = dexProfileDataArr.length;
            while (i < length) {
                DexProfileData dexProfileData2 = dexProfileDataArr[i];
                writeLineHeader(byteArrayOutputStream, dexProfileData2, generateDexKey(dexProfileData2.apkName, dexProfileData2.dexName, bArr));
                writeLineData(byteArrayOutputStream, dexProfileData2);
                i++;
            }
        } else {
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeLineHeader(byteArrayOutputStream, dexProfileData3, generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr));
            }
            int length2 = dexProfileDataArr.length;
            while (i < length2) {
                writeLineData(byteArrayOutputStream, dexProfileDataArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static boolean deleteFilesRecursively(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (File file2 : listFiles) {
            z = deleteFilesRecursively(file2) && z;
        }
        return z;
    }

    public static void dropShaderCache(Context context, MemoryCacheService memoryCacheService) {
        if (deleteFilesRecursively(Build.VERSION.SDK_INT >= 34 ? context.createDeviceProtectedStorageContext().getCacheDir() : context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
            memoryCacheService.onResultReceived(14, null);
        } else {
            memoryCacheService.onResultReceived(15, null);
        }
    }

    public static String generateDexKey(String str, String str2, byte[] bArr) {
        byte[] bArr2 = V001_N;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = V005_O;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boxes$$ExternalSyntheticOutline1.m(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static byte[] read(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Not enough bytes to read: "));
                return null;
            }
            i2 += read;
        }
        return bArr;
    }

    public static int[] readClasses(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) readUInt(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] readCompressed(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e) {
                    throw new IllegalStateException(e.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    public static DexProfileData[] readMeta(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, DexProfileData[] dexProfileDataArr) {
        byte[] bArr3 = METADATA_V001_N;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, METADATA_V002)) {
                a$$ExternalSyntheticBUOutline0.m$1("Unsupported meta version");
                return null;
            }
            int readUInt = (int) readUInt(fileInputStream, 2);
            byte[] readCompressed = readCompressed(fileInputStream, (int) readUInt(fileInputStream, 4), (int) readUInt(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                a$$ExternalSyntheticBUOutline0.m$1("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
            try {
                DexProfileData[] readMetadataV002Body = readMetadataV002Body(byteArrayInputStream, bArr2, readUInt, dexProfileDataArr);
                byteArrayInputStream.close();
                return readMetadataV002Body;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(V015_S, bArr2)) {
            a$$ExternalSyntheticBUOutline0.m$1("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            a$$ExternalSyntheticBUOutline0.m$1("Unsupported meta version");
            return null;
        }
        int readUInt2 = (int) readUInt(fileInputStream, 1);
        byte[] readCompressed2 = readCompressed(fileInputStream, (int) readUInt(fileInputStream, 4), (int) readUInt(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(readCompressed2);
        try {
            DexProfileData[] readMetadataForNBody = readMetadataForNBody(byteArrayInputStream2, readUInt2, dexProfileDataArr);
            byteArrayInputStream2.close();
            return readMetadataForNBody;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static DexProfileData[] readMetadataForNBody(ByteArrayInputStream byteArrayInputStream, int i, DexProfileData[] dexProfileDataArr) {
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            a$$ExternalSyntheticBUOutline0.m$1("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int readUInt = (int) readUInt(byteArrayInputStream, 2);
            iArr[i2] = (int) readUInt(byteArrayInputStream, 2);
            strArr[i2] = new String(read(byteArrayInputStream, readUInt), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            DexProfileData dexProfileData = dexProfileDataArr[i3];
            if (!dexProfileData.dexName.equals(strArr[i3])) {
                a$$ExternalSyntheticBUOutline0.m$1("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            dexProfileData.classSetSize = i4;
            dexProfileData.classes = readClasses(byteArrayInputStream, i4);
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] readMetadataV002Body(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, DexProfileData[] dexProfileDataArr) {
        DexProfileData dexProfileData;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        if (i != dexProfileDataArr.length) {
            a$$ExternalSyntheticBUOutline0.m$1("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            readUInt(byteArrayInputStream, 2);
            String str = new String(read(byteArrayInputStream, (int) readUInt(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long readUInt = readUInt(byteArrayInputStream, 4);
            int readUInt2 = (int) readUInt(byteArrayInputStream, 2);
            if (dexProfileDataArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < dexProfileDataArr.length; i3++) {
                    if (dexProfileDataArr[i3].dexName.equals(substring)) {
                        dexProfileData = dexProfileDataArr[i3];
                        break;
                    }
                }
            }
            dexProfileData = null;
            if (dexProfileData == null) {
                a$$ExternalSyntheticBUOutline0.m$1("Missing profile key: ".concat(str));
                return null;
            }
            dexProfileData.mTypeIdCount = readUInt;
            int[] readClasses = readClasses(byteArrayInputStream, readUInt2);
            if (Arrays.equals(bArr, V001_N)) {
                dexProfileData.classSetSize = readUInt2;
                dexProfileData.classes = readClasses;
            }
        }
        return dexProfileDataArr;
    }

    public static DexProfileData[] readProfile(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, V010_P)) {
            a$$ExternalSyntheticBUOutline0.m$1("Unsupported version");
            return null;
        }
        int readUInt = (int) readUInt(fileInputStream, 1);
        byte[] readCompressed = readCompressed(fileInputStream, (int) readUInt(fileInputStream, 4), (int) readUInt(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            a$$ExternalSyntheticBUOutline0.m$1("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(readCompressed);
        try {
            DexProfileData[] readUncompressedBody = readUncompressedBody(byteArrayInputStream, str, readUInt);
            byteArrayInputStream.close();
            return readUncompressedBody;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static long readUInt(InputStream inputStream, int i) {
        byte[] read = read(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (read[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static DexProfileData[] readUncompressedBody(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new DexProfileData[0];
        }
        DexProfileData[] dexProfileDataArr = new DexProfileData[i];
        for (int i3 = 0; i3 < i; i3++) {
            int readUInt = (int) readUInt(byteArrayInputStream, 2);
            int readUInt2 = (int) readUInt(byteArrayInputStream, 2);
            dexProfileDataArr[i3] = new DexProfileData(str, new String(read(byteArrayInputStream, readUInt), StandardCharsets.UTF_8), readUInt(byteArrayInputStream, 4), readUInt2, (int) readUInt(byteArrayInputStream, 4), (int) readUInt(byteArrayInputStream, 4), new int[readUInt2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            DexProfileData dexProfileData = dexProfileDataArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = dexProfileData.hotMethodRegionSize;
            int i6 = dexProfileData.numMethodIds;
            TreeMap treeMap = dexProfileData.methods;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) readUInt(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i8), 1);
                int readUInt3 = (int) readUInt(byteArrayInputStream, 2);
                while (readUInt3 > 0) {
                    readUInt(byteArrayInputStream, 2);
                    int readUInt4 = (int) readUInt(byteArrayInputStream, 1);
                    if (readUInt4 != 6 && readUInt4 != 7) {
                        while (readUInt4 > 0) {
                            readUInt(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int readUInt5 = (int) readUInt(byteArrayInputStream, 1); readUInt5 > 0; readUInt5--) {
                                readUInt(byteArrayInputStream, 2);
                            }
                            readUInt4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    readUInt3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                a$$ExternalSyntheticBUOutline0.m$1("Read too much data during profile line parse");
                return null;
            }
            dexProfileData.classes = readClasses(byteArrayInputStream, dexProfileData.classSetSize);
            BitSet valueOf = BitSet.valueOf(read(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i13));
                    if (num == null) {
                        num = Integer.valueOf(i11);
                    }
                    treeMap.put(Integer.valueOf(i13), Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return dexProfileDataArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean transcodeAndWriteBody(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, DexProfileData[] dexProfileDataArr) {
        long j;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = V015_S;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = V010_P;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] createCompressibleBody = createCompressibleBody(dexProfileDataArr, bArr3);
                writeUInt(byteArrayOutputStream, dexProfileDataArr.length, 1);
                writeUInt(byteArrayOutputStream, createCompressibleBody.length, 4);
                byte[] compress = compress(createCompressibleBody);
                writeUInt(byteArrayOutputStream, compress.length, 4);
                byteArrayOutputStream.write(compress);
                return true;
            }
            byte[] bArr4 = V005_O;
            if (Arrays.equals(bArr, bArr4)) {
                writeUInt(byteArrayOutputStream, dexProfileDataArr.length, 1);
                for (DexProfileData dexProfileData : dexProfileDataArr) {
                    int size = dexProfileData.methods.size() * 4;
                    String generateDexKey = generateDexKey(dexProfileData.apkName, dexProfileData.dexName, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    writeUInt16(byteArrayOutputStream, generateDexKey.getBytes(charset).length);
                    writeUInt16(byteArrayOutputStream, dexProfileData.classes.length);
                    writeUInt(byteArrayOutputStream, size, 4);
                    writeUInt(byteArrayOutputStream, dexProfileData.dexChecksum, 4);
                    byteArrayOutputStream.write(generateDexKey.getBytes(charset));
                    Iterator it = dexProfileData.methods.keySet().iterator();
                    while (it.hasNext()) {
                        writeUInt16(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        writeUInt16(byteArrayOutputStream, 0);
                    }
                    for (int i2 : dexProfileData.classes) {
                        writeUInt16(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = V009_O_MR1;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] createCompressibleBody2 = createCompressibleBody(dexProfileDataArr, bArr5);
                writeUInt(byteArrayOutputStream, dexProfileDataArr.length, 1);
                writeUInt(byteArrayOutputStream, createCompressibleBody2.length, 4);
                byte[] compress2 = compress(createCompressibleBody2);
                writeUInt(byteArrayOutputStream, compress2.length, 4);
                byteArrayOutputStream.write(compress2);
                return true;
            }
            byte[] bArr6 = V001_N;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            writeUInt16(byteArrayOutputStream, dexProfileDataArr.length);
            for (DexProfileData dexProfileData2 : dexProfileDataArr) {
                String str = dexProfileData2.apkName;
                TreeMap treeMap = dexProfileData2.methods;
                String generateDexKey2 = generateDexKey(str, dexProfileData2.dexName, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                writeUInt16(byteArrayOutputStream, generateDexKey2.getBytes(charset2).length);
                writeUInt16(byteArrayOutputStream, treeMap.size());
                writeUInt16(byteArrayOutputStream, dexProfileData2.classes.length);
                writeUInt(byteArrayOutputStream, dexProfileData2.dexChecksum, 4);
                byteArrayOutputStream.write(generateDexKey2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    writeUInt16(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : dexProfileData2.classes) {
                    writeUInt16(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            writeUInt16(byteArrayOutputStream2, dexProfileDataArr.length);
            int i4 = 2;
            int i5 = 2;
            for (DexProfileData dexProfileData3 : dexProfileDataArr) {
                writeUInt(byteArrayOutputStream2, dexProfileData3.dexChecksum, 4);
                writeUInt(byteArrayOutputStream2, dexProfileData3.mTypeIdCount, 4);
                writeUInt(byteArrayOutputStream2, dexProfileData3.numMethodIds, 4);
                String generateDexKey3 = generateDexKey(dexProfileData3.apkName, dexProfileData3.dexName, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = generateDexKey3.getBytes(charset3).length;
                writeUInt16(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(generateDexKey3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            WritableFileSection writableFileSection = new WritableFileSection(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(writableFileSection);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData4 = dexProfileDataArr[i6];
                    writeUInt16(byteArrayOutputStream3, i6);
                    writeUInt16(byteArrayOutputStream3, dexProfileData4.classSetSize);
                    i7 = i7 + 4 + (dexProfileData4.classSetSize * i4);
                    int[] iArr = dexProfileData4.classes;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        writeUInt16(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i4 = i4;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            int i10 = i4;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            WritableFileSection writableFileSection2 = new WritableFileSection(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < dexProfileDataArr.length) {
                try {
                    DexProfileData dexProfileData5 = dexProfileDataArr[i11];
                    Iterator it3 = dexProfileData5.methods.entrySet().iterator();
                    int i13 = 0;
                    while (it3.hasNext()) {
                        i13 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        writeMethodBitmapForS(byteArrayOutputStream4, i13, dexProfileData5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            writeMethodsWithInlineCaches(byteArrayOutputStream4, dexProfileData5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            writeUInt16(byteArrayOutputStream3, i11);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i12 + 6;
                            ArrayList arrayList4 = arrayList3;
                            writeUInt(byteArrayOutputStream3, length4, 4);
                            writeUInt16(byteArrayOutputStream3, i13);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i14 + length4;
                            i11++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            WritableFileSection writableFileSection3 = new WritableFileSection(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(writableFileSection3);
            long size2 = 12 + (arrayList2.size() * 16);
            writeUInt(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                WritableFileSection writableFileSection4 = (WritableFileSection) arrayList2.get(i15);
                int i16 = writableFileSection4.mType;
                byte[] bArr7 = writableFileSection4.mContents;
                int i17 = i10;
                if (i16 == 1) {
                    j = 0;
                } else if (i16 == i17) {
                    j = 1;
                } else if (i16 == 3) {
                    j = 2;
                } else if (i16 == 4) {
                    j = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    j = 4;
                }
                writeUInt(byteArrayOutputStream, j, 4);
                writeUInt(byteArrayOutputStream, size2, 4);
                if (writableFileSection4.mNeedsCompression) {
                    long length5 = bArr7.length;
                    byte[] compress3 = compress(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(compress3);
                    writeUInt(byteArrayOutputStream, compress3.length, 4);
                    writeUInt(byteArrayOutputStream, length5, 4);
                    length = compress3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    writeUInt(byteArrayOutputStream, bArr7.length, 4);
                    writeUInt(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i15++;
                arrayList5 = arrayList;
                i10 = i17;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void writeLineData(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) {
        writeMethodsWithInlineCaches(byteArrayOutputStream, dexProfileData);
        int i = dexProfileData.numMethodIds;
        int[] iArr = dexProfileData.classes;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            writeUInt16(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.methods.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void writeLineHeader(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData, String str) {
        Charset charset = StandardCharsets.UTF_8;
        writeUInt16(byteArrayOutputStream, str.getBytes(charset).length);
        writeUInt16(byteArrayOutputStream, dexProfileData.classSetSize);
        writeUInt(byteArrayOutputStream, dexProfileData.hotMethodRegionSize, 4);
        writeUInt(byteArrayOutputStream, dexProfileData.dexChecksum, 4);
        writeUInt(byteArrayOutputStream, dexProfileData.numMethodIds, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void writeMethodBitmapForS(ByteArrayOutputStream byteArrayOutputStream, int i, DexProfileData dexProfileData) {
        int i2 = dexProfileData.numMethodIds;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : dexProfileData.methods.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void writeMethodsWithInlineCaches(ByteArrayOutputStream byteArrayOutputStream, DexProfileData dexProfileData) {
        int i = 0;
        for (Map.Entry entry : dexProfileData.methods.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                writeUInt16(byteArrayOutputStream, intValue - i);
                writeUInt16(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static void writeUInt(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void writeUInt16(ByteArrayOutputStream byteArrayOutputStream, int i) {
        writeUInt(byteArrayOutputStream, i, 2);
    }
}
