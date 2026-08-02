package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.Internal;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class SchemaUtil {
    public static final Class GENERATED_MESSAGE_CLASS;
    public static final UnknownFieldSchema UNKNOWN_FIELD_SET_FULL_SCHEMA;
    public static final UnknownFieldSetLiteSchema UNKNOWN_FIELD_SET_LITE_SCHEMA;

    static {
        Class<?> cls;
        Class<?> cls2;
        Protobuf protobuf = Protobuf.INSTANCE;
        UnknownFieldSchema unknownFieldSchema = null;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        GENERATED_MESSAGE_CLASS = cls;
        try {
            Protobuf protobuf2 = Protobuf.INSTANCE;
            try {
                cls2 = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
            } catch (Throwable unused2) {
                cls2 = null;
            }
            if (cls2 != null) {
                unknownFieldSchema = (UnknownFieldSchema) cls2.getConstructor(null).newInstance(null);
            }
        } catch (Throwable unused3) {
        }
        UNKNOWN_FIELD_SET_FULL_SCHEMA = unknownFieldSchema;
        UNKNOWN_FIELD_SET_LITE_SCHEMA = new UnknownFieldSetLiteSchema();
    }

    public static int computeSizeEnumListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeFixed32List(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream$ArrayEncoder.computeTagSize(i) + 4) * size;
    }

    public static int computeSizeFixed64List(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (CodedOutputStream$ArrayEncoder.computeTagSize(i) + 8) * size;
    }

    public static int computeSizeInt32ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeInt64ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeSInt32ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeSInt64ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeUInt32ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof IntArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(intArrayList.getInt(i));
            i++;
        }
        return i3;
    }

    public static int computeSizeUInt64ListNoTag(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof LongArrayList)) {
            int i2 = 0;
            while (i < size) {
                i2 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Long) list.get(i)).longValue());
                i++;
            }
            return i2;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        int i3 = 0;
        while (i < size) {
            i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(longArrayList.getLong(i));
            i++;
        }
        return i3;
    }

    public static Object filterUnknownEnumList(Object obj, int i, Internal.ProtobufList protobufList, Object obj2, UnknownFieldSchema unknownFieldSchema) {
        return obj2;
    }

    public static void mergeUnknownFields(UnknownFieldSchema unknownFieldSchema, Object obj, Object obj2) {
        ((UnknownFieldSetLiteSchema) unknownFieldSchema).getClass();
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        UnknownFieldSetLite unknownFieldSetLite2 = ((GeneratedMessageLite) obj2).unknownFields;
        UnknownFieldSetLite unknownFieldSetLite3 = UnknownFieldSetLite.DEFAULT_INSTANCE;
        if (!unknownFieldSetLite3.equals(unknownFieldSetLite2)) {
            if (unknownFieldSetLite3.equals(unknownFieldSetLite)) {
                int i = unknownFieldSetLite.count + unknownFieldSetLite2.count;
                int[] copyOf = Arrays.copyOf(unknownFieldSetLite.tags, i);
                System.arraycopy(unknownFieldSetLite2.tags, 0, copyOf, unknownFieldSetLite.count, unknownFieldSetLite2.count);
                Object[] copyOf2 = Arrays.copyOf(unknownFieldSetLite.objects, i);
                System.arraycopy(unknownFieldSetLite2.objects, 0, copyOf2, unknownFieldSetLite.count, unknownFieldSetLite2.count);
                unknownFieldSetLite = new UnknownFieldSetLite(i, copyOf, copyOf2, true);
            } else {
                unknownFieldSetLite.getClass();
                if (!unknownFieldSetLite2.equals(unknownFieldSetLite3)) {
                    if (!unknownFieldSetLite.isMutable) {
                        OptionalProvider$$ExternalSyntheticLambda0.m();
                        return;
                    }
                    int i2 = unknownFieldSetLite.count + unknownFieldSetLite2.count;
                    unknownFieldSetLite.ensureCapacity(i2);
                    System.arraycopy(unknownFieldSetLite2.tags, 0, unknownFieldSetLite.tags, unknownFieldSetLite.count, unknownFieldSetLite2.count);
                    System.arraycopy(unknownFieldSetLite2.objects, 0, unknownFieldSetLite.objects, unknownFieldSetLite.count, unknownFieldSetLite2.count);
                    unknownFieldSetLite.count = i2;
                }
            }
        }
        generatedMessageLite.unknownFields = unknownFieldSetLite;
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void writeBoolList(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof BooleanArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    boolean booleanValue = ((Boolean) list.get(i3)).booleanValue();
                    codedOutputStream$ArrayEncoder.writeTag(i, 0);
                    codedOutputStream$ArrayEncoder.write(booleanValue ? (byte) 1 : (byte) 0);
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                ((Boolean) list.get(i5)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i4++;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i4);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.write(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
                i2++;
            }
            return;
        }
        BooleanArrayList booleanArrayList = (BooleanArrayList) list;
        if (!z) {
            for (int i6 = 0; i6 < booleanArrayList.size(); i6++) {
                boolean z3 = booleanArrayList.getBoolean(i6);
                codedOutputStream$ArrayEncoder.writeTag(i, 0);
                codedOutputStream$ArrayEncoder.write(z3 ? (byte) 1 : (byte) 0);
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i7 = 0;
        for (int i8 = 0; i8 < booleanArrayList.size(); i8++) {
            booleanArrayList.getBoolean(i8);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i7++;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i7);
        while (i2 < booleanArrayList.size()) {
            codedOutputStream$ArrayEncoder.write(booleanArrayList.getBoolean(i2) ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public static void writeDoubleList(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof DoubleArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    double doubleValue = ((Double) list.get(i2)).doubleValue();
                    codedOutputStream$ArrayEncoder.getClass();
                    codedOutputStream$ArrayEncoder.writeFixed64(i, Double.doubleToRawLongBits(doubleValue));
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 8;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed64NoTag(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        DoubleArrayList doubleArrayList = (DoubleArrayList) list;
        if (!z) {
            while (i2 < doubleArrayList.size()) {
                double d = doubleArrayList.getDouble(i2);
                codedOutputStream$ArrayEncoder.getClass();
                codedOutputStream$ArrayEncoder.writeFixed64(i, Double.doubleToRawLongBits(d));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < doubleArrayList.size(); i6++) {
            doubleArrayList.getDouble(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 8;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < doubleArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed64NoTag(Double.doubleToRawLongBits(doubleArrayList.getDouble(i2)));
            i2++;
        }
    }

    public static void writeEnumList(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeInt32(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeInt32(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(intArrayList.getInt(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeInt32NoTag(intArrayList.getInt(i2));
            i2++;
        }
    }

    public static void writeFixed32List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 4;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeFixed32(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            intArrayList.getInt(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 4;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed32NoTag(intArrayList.getInt(i2));
            i2++;
        }
    }

    public static void writeFixed64List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeFixed64(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 8;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeFixed64(i, longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            longArrayList.getLong(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 8;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed64NoTag(longArrayList.getLong(i2));
            i2++;
        }
    }

    public static void writeFloatList(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof FloatArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    float floatValue = ((Float) list.get(i2)).floatValue();
                    codedOutputStream$ArrayEncoder.getClass();
                    codedOutputStream$ArrayEncoder.writeFixed32(i, Float.floatToRawIntBits(floatValue));
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 4;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed32NoTag(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        FloatArrayList floatArrayList = (FloatArrayList) list;
        if (!z) {
            while (i2 < floatArrayList.size()) {
                float f = floatArrayList.getFloat(i2);
                codedOutputStream$ArrayEncoder.getClass();
                codedOutputStream$ArrayEncoder.writeFixed32(i, Float.floatToRawIntBits(f));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < floatArrayList.size(); i6++) {
            floatArrayList.getFloat(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 4;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < floatArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed32NoTag(Float.floatToRawIntBits(floatArrayList.getFloat(i2)));
            i2++;
        }
    }

    public static void writeInt32List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeInt32(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeInt32(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(intArrayList.getInt(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeInt32NoTag(intArrayList.getInt(i2));
            i2++;
        }
    }

    public static void writeInt64List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeUInt64(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeUInt64(i, longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(longArrayList.getLong(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeUInt64NoTag(longArrayList.getLong(i2));
            i2++;
        }
    }

    public static void writeSFixed32List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeFixed32(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 4;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeFixed32(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            intArrayList.getInt(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 4;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed32NoTag(intArrayList.getInt(i2));
            i2++;
        }
    }

    public static void writeSFixed64List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeFixed64(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).getClass();
                Logger logger = CodedOutputStream$ArrayEncoder.logger;
                i3 += 8;
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeFixed64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeFixed64(i, longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            longArrayList.getLong(i6);
            Logger logger2 = CodedOutputStream$ArrayEncoder.logger;
            i5 += 8;
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeFixed64NoTag(longArrayList.getLong(i2));
            i2++;
        }
    }

    public static void writeSInt32List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    codedOutputStream$ArrayEncoder.writeUInt32(i, (intValue >> 31) ^ (intValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                int intValue2 = ((Integer) list.get(i2)).intValue();
                codedOutputStream$ArrayEncoder.writeUInt32NoTag((intValue2 >> 31) ^ (intValue2 << 1));
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                int i5 = intArrayList.getInt(i2);
                codedOutputStream$ArrayEncoder.writeUInt32(i, (i5 >> 31) ^ (i5 << 1));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i6 = 0;
        for (int i7 = 0; i7 < intArrayList.size(); i7++) {
            i6 += CodedOutputStream$ArrayEncoder.computeSInt32SizeNoTag(intArrayList.getInt(i7));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i6);
        while (i2 < intArrayList.size()) {
            int i8 = intArrayList.getInt(i2);
            codedOutputStream$ArrayEncoder.writeUInt32NoTag((i8 >> 31) ^ (i8 << 1));
            i2++;
        }
    }

    public static void writeSInt64List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    long longValue = ((Long) list.get(i2)).longValue();
                    codedOutputStream$ArrayEncoder.writeUInt64(i, (longValue >> 63) ^ (longValue << 1));
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                long longValue2 = ((Long) list.get(i2)).longValue();
                codedOutputStream$ArrayEncoder.writeUInt64NoTag((longValue2 >> 63) ^ (longValue2 << 1));
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                long j = longArrayList.getLong(i2);
                codedOutputStream$ArrayEncoder.writeUInt64(i, (j >> 63) ^ (j << 1));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeSInt64SizeNoTag(longArrayList.getLong(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < longArrayList.size()) {
            long j2 = longArrayList.getLong(i2);
            codedOutputStream$ArrayEncoder.writeUInt64NoTag((j2 >> 63) ^ (j2 << 1));
            i2++;
        }
    }

    public static void writeUInt32List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof IntArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeUInt32(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(((Integer) list.get(i4)).intValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeUInt32NoTag(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        IntArrayList intArrayList = (IntArrayList) list;
        if (!z) {
            while (i2 < intArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeUInt32(i, intArrayList.getInt(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < intArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeUInt32SizeNoTag(intArrayList.getInt(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < intArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(intArrayList.getInt(i2));
            i2++;
        }
    }

    public static void writeUInt64List(int i, List list, ManifestSchemaFactory manifestSchemaFactory, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        boolean z2 = list instanceof LongArrayList;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) manifestSchemaFactory.messageInfoFactory;
        int i2 = 0;
        if (!z2) {
            if (!z) {
                while (i2 < list.size()) {
                    codedOutputStream$ArrayEncoder.writeUInt64(i, ((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            codedOutputStream$ArrayEncoder.writeTag(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(((Long) list.get(i4)).longValue());
            }
            codedOutputStream$ArrayEncoder.writeUInt32NoTag(i3);
            while (i2 < list.size()) {
                codedOutputStream$ArrayEncoder.writeUInt64NoTag(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        LongArrayList longArrayList = (LongArrayList) list;
        if (!z) {
            while (i2 < longArrayList.size()) {
                codedOutputStream$ArrayEncoder.writeUInt64(i, longArrayList.getLong(i2));
                i2++;
            }
            return;
        }
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < longArrayList.size(); i6++) {
            i5 += CodedOutputStream$ArrayEncoder.computeUInt64SizeNoTag(longArrayList.getLong(i6));
        }
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(i5);
        while (i2 < longArrayList.size()) {
            codedOutputStream$ArrayEncoder.writeUInt64NoTag(longArrayList.getLong(i2));
            i2++;
        }
    }
}
