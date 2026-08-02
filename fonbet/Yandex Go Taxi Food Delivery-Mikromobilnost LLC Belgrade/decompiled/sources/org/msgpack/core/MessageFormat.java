package org.msgpack.core;

import org.msgpack.value.ValueType;
import ru.CryptoPro.reprov.array.DerValue;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'POSFIXINT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes4.dex */
public final class MessageFormat {
    private static final /* synthetic */ MessageFormat[] $VALUES;
    public static final MessageFormat ARRAY16;
    public static final MessageFormat ARRAY32;
    public static final MessageFormat BIN16;
    public static final MessageFormat BIN32;
    public static final MessageFormat BIN8;
    public static final MessageFormat BOOLEAN;
    public static final MessageFormat EXT16;
    public static final MessageFormat EXT32;
    public static final MessageFormat EXT8;
    public static final MessageFormat FIXARRAY;
    public static final MessageFormat FIXEXT1;
    public static final MessageFormat FIXEXT16;
    public static final MessageFormat FIXEXT2;
    public static final MessageFormat FIXEXT4;
    public static final MessageFormat FIXEXT8;
    public static final MessageFormat FIXMAP;
    public static final MessageFormat FIXSTR;
    public static final MessageFormat FLOAT32;
    public static final MessageFormat FLOAT64;
    public static final MessageFormat INT16;
    public static final MessageFormat INT32;
    public static final MessageFormat INT64;
    public static final MessageFormat INT8;
    public static final MessageFormat MAP16;
    public static final MessageFormat MAP32;
    public static final MessageFormat NEGFIXINT;
    public static final MessageFormat NEVER_USED;
    public static final MessageFormat NIL;
    public static final MessageFormat POSFIXINT;
    public static final MessageFormat STR16;
    public static final MessageFormat STR32;
    public static final MessageFormat STR8;
    public static final MessageFormat UINT16;
    public static final MessageFormat UINT32;
    public static final MessageFormat UINT64;
    public static final MessageFormat UINT8;
    private static final MessageFormat[] formatTable;
    private final ValueType valueType;

    static {
        MessageFormat messageFormat;
        ValueType valueType = ValueType.INTEGER;
        MessageFormat messageFormat2 = new MessageFormat("POSFIXINT", 0, valueType);
        POSFIXINT = messageFormat2;
        ValueType valueType2 = ValueType.MAP;
        MessageFormat messageFormat3 = new MessageFormat("FIXMAP", 1, valueType2);
        FIXMAP = messageFormat3;
        ValueType valueType3 = ValueType.ARRAY;
        MessageFormat messageFormat4 = new MessageFormat("FIXARRAY", 2, valueType3);
        FIXARRAY = messageFormat4;
        ValueType valueType4 = ValueType.STRING;
        MessageFormat messageFormat5 = new MessageFormat("FIXSTR", 3, valueType4);
        FIXSTR = messageFormat5;
        MessageFormat messageFormat6 = new MessageFormat("NIL", 4, ValueType.NIL);
        NIL = messageFormat6;
        MessageFormat messageFormat7 = new MessageFormat("NEVER_USED", 5, null);
        NEVER_USED = messageFormat7;
        MessageFormat messageFormat8 = new MessageFormat("BOOLEAN", 6, ValueType.BOOLEAN);
        BOOLEAN = messageFormat8;
        ValueType valueType5 = ValueType.BINARY;
        MessageFormat messageFormat9 = new MessageFormat("BIN8", 7, valueType5);
        BIN8 = messageFormat9;
        MessageFormat messageFormat10 = new MessageFormat("BIN16", 8, valueType5);
        BIN16 = messageFormat10;
        MessageFormat messageFormat11 = new MessageFormat("BIN32", 9, valueType5);
        BIN32 = messageFormat11;
        ValueType valueType6 = ValueType.EXTENSION;
        MessageFormat messageFormat12 = new MessageFormat("EXT8", 10, valueType6);
        EXT8 = messageFormat12;
        MessageFormat messageFormat13 = new MessageFormat("EXT16", 11, valueType6);
        EXT16 = messageFormat13;
        MessageFormat messageFormat14 = new MessageFormat("EXT32", 12, valueType6);
        EXT32 = messageFormat14;
        ValueType valueType7 = ValueType.FLOAT;
        MessageFormat messageFormat15 = new MessageFormat("FLOAT32", 13, valueType7);
        FLOAT32 = messageFormat15;
        MessageFormat messageFormat16 = new MessageFormat("FLOAT64", 14, valueType7);
        FLOAT64 = messageFormat16;
        MessageFormat messageFormat17 = new MessageFormat("UINT8", 15, valueType);
        UINT8 = messageFormat17;
        MessageFormat messageFormat18 = new MessageFormat("UINT16", 16, valueType);
        UINT16 = messageFormat18;
        MessageFormat messageFormat19 = new MessageFormat("UINT32", 17, valueType);
        UINT32 = messageFormat19;
        MessageFormat messageFormat20 = new MessageFormat("UINT64", 18, valueType);
        UINT64 = messageFormat20;
        MessageFormat messageFormat21 = new MessageFormat("INT8", 19, valueType);
        INT8 = messageFormat21;
        MessageFormat messageFormat22 = new MessageFormat("INT16", 20, valueType);
        INT16 = messageFormat22;
        MessageFormat messageFormat23 = new MessageFormat("INT32", 21, valueType);
        INT32 = messageFormat23;
        MessageFormat messageFormat24 = new MessageFormat("INT64", 22, valueType);
        INT64 = messageFormat24;
        MessageFormat messageFormat25 = new MessageFormat("FIXEXT1", 23, valueType6);
        FIXEXT1 = messageFormat25;
        MessageFormat messageFormat26 = new MessageFormat("FIXEXT2", 24, valueType6);
        FIXEXT2 = messageFormat26;
        MessageFormat messageFormat27 = new MessageFormat("FIXEXT4", 25, valueType6);
        FIXEXT4 = messageFormat27;
        MessageFormat messageFormat28 = new MessageFormat("FIXEXT8", 26, valueType6);
        FIXEXT8 = messageFormat28;
        MessageFormat messageFormat29 = new MessageFormat("FIXEXT16", 27, valueType6);
        FIXEXT16 = messageFormat29;
        MessageFormat messageFormat30 = new MessageFormat("STR8", 28, valueType4);
        STR8 = messageFormat30;
        MessageFormat messageFormat31 = new MessageFormat("STR16", 29, valueType4);
        STR16 = messageFormat31;
        MessageFormat messageFormat32 = new MessageFormat("STR32", 30, valueType4);
        STR32 = messageFormat32;
        MessageFormat messageFormat33 = new MessageFormat("ARRAY16", 31, valueType3);
        ARRAY16 = messageFormat33;
        MessageFormat messageFormat34 = new MessageFormat("ARRAY32", 32, valueType3);
        ARRAY32 = messageFormat34;
        MessageFormat messageFormat35 = new MessageFormat("MAP16", 33, valueType2);
        MAP16 = messageFormat35;
        MessageFormat messageFormat36 = new MessageFormat("MAP32", 34, valueType2);
        MAP32 = messageFormat36;
        MessageFormat messageFormat37 = new MessageFormat("NEGFIXINT", 35, valueType);
        NEGFIXINT = messageFormat37;
        $VALUES = new MessageFormat[]{messageFormat2, messageFormat3, messageFormat4, messageFormat5, messageFormat6, messageFormat7, messageFormat8, messageFormat9, messageFormat10, messageFormat11, messageFormat12, messageFormat13, messageFormat14, messageFormat15, messageFormat16, messageFormat17, messageFormat18, messageFormat19, messageFormat20, messageFormat21, messageFormat22, messageFormat23, messageFormat24, messageFormat25, messageFormat26, messageFormat27, messageFormat28, messageFormat29, messageFormat30, messageFormat31, messageFormat32, messageFormat33, messageFormat34, messageFormat35, messageFormat36, messageFormat37};
        formatTable = new MessageFormat[256];
        for (int i = 0; i <= 255; i++) {
            byte b = (byte) i;
            if ((b & DerValue.TAG_CONTEXT) != 0) {
                int i2 = b & (-32);
                if (i2 == -32) {
                    messageFormat = NEGFIXINT;
                } else if (i2 != -96) {
                    int i3 = b & (-16);
                    if (i3 == -112) {
                        messageFormat = FIXARRAY;
                    } else if (i3 != -128) {
                        switch (b) {
                            case -64:
                                messageFormat = NIL;
                                break;
                            case -63:
                            default:
                                messageFormat = NEVER_USED;
                                break;
                            case -62:
                            case -61:
                                messageFormat = BOOLEAN;
                                break;
                            case -60:
                                messageFormat = BIN8;
                                break;
                            case -59:
                                messageFormat = BIN16;
                                break;
                            case -58:
                                messageFormat = BIN32;
                                break;
                            case -57:
                                messageFormat = EXT8;
                                break;
                            case -56:
                                messageFormat = EXT16;
                                break;
                            case -55:
                                messageFormat = EXT32;
                                break;
                            case -54:
                                messageFormat = FLOAT32;
                                break;
                            case -53:
                                messageFormat = FLOAT64;
                                break;
                            case -52:
                                messageFormat = UINT8;
                                break;
                            case -51:
                                messageFormat = UINT16;
                                break;
                            case -50:
                                messageFormat = UINT32;
                                break;
                            case -49:
                                messageFormat = UINT64;
                                break;
                            case -48:
                                messageFormat = INT8;
                                break;
                            case -47:
                                messageFormat = INT16;
                                break;
                            case -46:
                                messageFormat = INT32;
                                break;
                            case -45:
                                messageFormat = INT64;
                                break;
                            case -44:
                                messageFormat = FIXEXT1;
                                break;
                            case -43:
                                messageFormat = FIXEXT2;
                                break;
                            case -42:
                                messageFormat = FIXEXT4;
                                break;
                            case -41:
                                messageFormat = FIXEXT8;
                                break;
                            case -40:
                                messageFormat = FIXEXT16;
                                break;
                            case -39:
                                messageFormat = STR8;
                                break;
                            case -38:
                                messageFormat = STR16;
                                break;
                            case -37:
                                messageFormat = STR32;
                                break;
                            case -36:
                                messageFormat = ARRAY16;
                                break;
                            case -35:
                                messageFormat = ARRAY32;
                                break;
                            case -34:
                                messageFormat = MAP16;
                                break;
                            case -33:
                                messageFormat = MAP32;
                                break;
                        }
                    } else {
                        messageFormat = FIXMAP;
                    }
                } else {
                    messageFormat = FIXSTR;
                }
            } else {
                messageFormat = POSFIXINT;
            }
            formatTable[i] = messageFormat;
        }
    }

    public MessageFormat(String str, int i, ValueType valueType) {
        this.valueType = valueType;
    }

    public static MessageFormat b(byte b) {
        return formatTable[b & 255];
    }

    public static MessageFormat valueOf(String str) {
        return (MessageFormat) Enum.valueOf(MessageFormat.class, str);
    }

    public static MessageFormat[] values() {
        return (MessageFormat[]) $VALUES.clone();
    }

    public final ValueType a() {
        if (this != NEVER_USED) {
            return this.valueType;
        }
        throw new MessageFormatException("Cannot convert NEVER_USED to ValueType");
    }
}
