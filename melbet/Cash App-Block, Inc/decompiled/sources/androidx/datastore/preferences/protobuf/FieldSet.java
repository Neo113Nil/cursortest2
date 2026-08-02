package androidx.datastore.preferences.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class FieldSet {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final SmallSortedMap$1 fields = SmallSortedMap$1.newFieldMap();
    public boolean isImmutable;

    static {
        new FieldSet(0);
    }

    public FieldSet(int i) {
        makeImmutable();
        makeImmutable();
    }

    public static void writeElement(CodedOutputStream$OutputStreamEncoder codedOutputStream$OutputStreamEncoder, WireFormat$FieldType wireFormat$FieldType, int i, Object obj) {
        if (wireFormat$FieldType == WireFormat$FieldType.GROUP) {
            codedOutputStream$OutputStreamEncoder.writeTag(i, 3);
            ((AbstractMessageLite) obj).writeTo(codedOutputStream$OutputStreamEncoder);
            codedOutputStream$OutputStreamEncoder.writeTag(i, 4);
        }
        codedOutputStream$OutputStreamEncoder.writeTag(i, wireFormat$FieldType.wireType);
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                codedOutputStream$OutputStreamEncoder.writeFixed64NoTag(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                codedOutputStream$OutputStreamEncoder.writeFixed32NoTag(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                codedOutputStream$OutputStreamEncoder.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 3:
                codedOutputStream$OutputStreamEncoder.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream$OutputStreamEncoder.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 5:
                codedOutputStream$OutputStreamEncoder.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 6:
                codedOutputStream$OutputStreamEncoder.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 7:
                codedOutputStream$OutputStreamEncoder.write(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof ByteString$LiteralByteString)) {
                    codedOutputStream$OutputStreamEncoder.writeStringNoTag((String) obj);
                    break;
                } else {
                    codedOutputStream$OutputStreamEncoder.writeBytesNoTag((ByteString$LiteralByteString) obj);
                    break;
                }
            case 9:
                ((AbstractMessageLite) obj).writeTo(codedOutputStream$OutputStreamEncoder);
                break;
            case 10:
                AbstractMessageLite abstractMessageLite = (AbstractMessageLite) obj;
                codedOutputStream$OutputStreamEncoder.writeUInt32NoTag(((GeneratedMessageLite) abstractMessageLite).getSerializedSize(null));
                abstractMessageLite.writeTo(codedOutputStream$OutputStreamEncoder);
                break;
            case 11:
                if (!(obj instanceof ByteString$LiteralByteString)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    codedOutputStream$OutputStreamEncoder.writeUInt32NoTag(length);
                    codedOutputStream$OutputStreamEncoder.write(bArr, 0, length);
                    break;
                } else {
                    codedOutputStream$OutputStreamEncoder.writeBytesNoTag((ByteString$LiteralByteString) obj);
                    break;
                }
            case 12:
                codedOutputStream$OutputStreamEncoder.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 13:
                codedOutputStream$OutputStreamEncoder.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream$OutputStreamEncoder.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream$OutputStreamEncoder.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                int intValue = ((Integer) obj).intValue();
                codedOutputStream$OutputStreamEncoder.writeUInt32NoTag((intValue >> 31) ^ (intValue << 1));
                break;
            case 17:
                long longValue = ((Long) obj).longValue();
                codedOutputStream$OutputStreamEncoder.writeUInt64NoTag((longValue >> 63) ^ (longValue << 1));
                break;
        }
    }

    public final Object clone() {
        FieldSet fieldSet = new FieldSet();
        SmallSortedMap$1 smallSortedMap$1 = this.fields;
        if (smallSortedMap$1.entryList.size() > 0) {
            Map.Entry arrayEntryAt = smallSortedMap$1.getArrayEntryAt(0);
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(arrayEntryAt.getKey());
            arrayEntryAt.getValue();
            throw null;
        }
        Iterator it = smallSortedMap$1.getOverflowEntries().iterator();
        if (!it.hasNext()) {
            return fieldSet;
        }
        Map.Entry entry = (Map.Entry) it.next();
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FieldSet) {
            return this.fields.equals(((FieldSet) obj).fields);
        }
        return false;
    }

    public final int hashCode() {
        return this.fields.hashCode();
    }

    public final void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        SmallSortedMap$1 smallSortedMap$1 = this.fields;
        int size = smallSortedMap$1.entryList.size();
        for (int i = 0; i < size; i++) {
            Map.Entry arrayEntryAt = smallSortedMap$1.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) arrayEntryAt.getValue();
                generatedMessageLite.getClass();
                Protobuf protobuf = Protobuf.INSTANCE;
                protobuf.getClass();
                protobuf.schemaFor(generatedMessageLite.getClass()).makeImmutable(generatedMessageLite);
                generatedMessageLite.markImmutable();
            }
        }
        if (!smallSortedMap$1.isImmutable) {
            if (smallSortedMap$1.entryList.size() > 0) {
                smallSortedMap$1.getArrayEntryAt(0).getKey().getClass();
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            } else {
                Iterator it = smallSortedMap$1.getOverflowEntries().iterator();
                if (it.hasNext()) {
                    ((Map.Entry) it.next()).getKey().getClass();
                    a$$ExternalSyntheticBUOutline0.m$1();
                    return;
                }
            }
        }
        if (!smallSortedMap$1.isImmutable) {
            smallSortedMap$1.overflowEntries = smallSortedMap$1.overflowEntries.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(smallSortedMap$1.overflowEntries);
            smallSortedMap$1.overflowEntriesDescending = smallSortedMap$1.overflowEntriesDescending.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(smallSortedMap$1.overflowEntriesDescending);
            smallSortedMap$1.isImmutable = true;
        }
        this.isImmutable = true;
    }

    public FieldSet() {
    }
}
