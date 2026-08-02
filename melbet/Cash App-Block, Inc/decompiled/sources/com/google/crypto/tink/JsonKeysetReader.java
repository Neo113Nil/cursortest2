package com.google.crypto.tink;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.internal.JsonParser;
import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.Keyset;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Base64;
import com.google.crypto.tink.subtle.Hex;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class JsonKeysetReader {
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public final InputStream inputStream;

    public JsonKeysetReader(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public static int getKeyId(JsonElement jsonElement) {
        if (!jsonElement.isJsonPrimitive()) {
            a$$ExternalSyntheticBUOutline0.m$4("invalid key id: not a JSON primitive");
            return 0;
        }
        if (!jsonElement.getAsJsonPrimitive().isNumber()) {
            a$$ExternalSyntheticBUOutline0.m$4("invalid key id: not a JSON number");
            return 0;
        }
        Number asNumber = jsonElement.getAsJsonPrimitive().getAsNumber();
        try {
            JsonParser.JsonElementTypeAdapter jsonElementTypeAdapter = JsonParser.JSON_ELEMENT;
            if (!(asNumber instanceof JsonParser.LazilyParsedNumber)) {
                throw new IllegalArgumentException("does not contain a parsed number.");
            }
            long parseLong = Long.parseLong(asNumber.toString());
            if (parseLong <= BodyPartID.bodyIdMax && parseLong >= -2147483648L) {
                return (int) parseLong;
            }
            a$$ExternalSyntheticBUOutline0.m$4("invalid key id");
            return 0;
        } catch (NumberFormatException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0269, code lost:
    
        if (r15 == r6) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x026c, code lost:
    
        if (r15 == 2) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x026e, code lost:
    
        r7 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x026f, code lost:
    
        if (r15 == 3) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0272, code lost:
    
        if (r15 == 4) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0274, code lost:
    
        r10 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x028e, code lost:
    
        if (r10 != r14) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0290, code lost:
    
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0299, code lost:
    
        r10 = com.google.crypto.tink.proto.KeyData.newBuilder();
        r5 = r4.get("typeUrl").getAsString();
        r10.copyOnWrite();
        com.google.crypto.tink.proto.KeyData.access$100((com.google.crypto.tink.proto.KeyData) r10.instance, r5);
        r0 = com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(r14, r0.length, r0);
        r10.copyOnWrite();
        com.google.crypto.tink.proto.KeyData.access$400((com.google.crypto.tink.proto.KeyData) r10.instance, r0);
        r0 = r4.get("keyMaterialType").getAsString();
        r0.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02cd, code lost:
    
        switch(r0.hashCode()) {
            case -1881281466: goto L166;
            case -1609477353: goto L162;
            case 249237018: goto L158;
            case 1534613202: goto L154;
            default: goto L153;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02d0, code lost:
    
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02fd, code lost:
    
        switch(r11) {
            case 0: goto L176;
            case 1: goto L175;
            case 2: goto L174;
            case 3: goto L173;
            default: goto L213;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x030d, code lost:
    
        r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0318, code lost:
    
        r10.copyOnWrite();
        com.google.crypto.tink.proto.KeyData.access$700((com.google.crypto.tink.proto.KeyData) r10.instance, r0);
        r0 = (com.google.crypto.tink.proto.KeyData) r10.build();
        r9.copyOnWrite();
        com.google.crypto.tink.proto.Keyset.Key.access$100((com.google.crypto.tink.proto.Keyset.Key) r9.instance, r0);
        r0 = (com.google.crypto.tink.proto.Keyset.Key) r9.build();
        r2.copyOnWrite();
        com.google.crypto.tink.proto.Keyset.access$1700((com.google.crypto.tink.proto.Keyset) r2.instance, r0);
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0310, code lost:
    
        r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0313, code lost:
    
        r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0316, code lost:
    
        r0 = com.google.crypto.tink.proto.KeyData.KeyMaterialType.REMOTE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x030c, code lost:
    
        throw new com.google.gson.JsonParseException("unknown key material type: ".concat(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02d8, code lost:
    
        if (r0.equals("ASYMMETRIC_PUBLIC") != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02db, code lost:
    
        r11 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02e3, code lost:
    
        if (r0.equals("ASYMMETRIC_PRIVATE") != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02e6, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02ee, code lost:
    
        if (r0.equals("SYMMETRIC") != false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02f1, code lost:
    
        r11 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f9, code lost:
    
        if (r0.equals("REMOTE") != false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02fc, code lost:
    
        r11 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0292, code lost:
    
        r11 = new byte[r10];
        r14 = 0;
        java.lang.System.arraycopy(r0, 0, r11, 0, r10);
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0277, code lost:
    
        r10 = r17 + 1;
        r0[r17] = (byte) (r16 >> 10);
        r17 = r17 + 2;
        r0[r10] = (byte) (r16 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0286, code lost:
    
        r7 = 3;
        r10 = r17 + 1;
        r0[r17] = (byte) (r16 >> 4);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Keyset keysetFromJson(JsonObject jsonObject) {
        char c;
        KeyStatusType keyStatusType;
        char c2;
        OutputPrefixType outputPrefixType;
        int i;
        int i2;
        if (!jsonObject.has("key")) {
            throw new JsonParseException("invalid keyset: no key");
        }
        JsonElement jsonElement = jsonObject.get("key");
        if (!jsonElement.isJsonArray()) {
            throw new JsonParseException("invalid keyset: key must be an array");
        }
        JsonArray asJsonArray = jsonElement.getAsJsonArray();
        if (asJsonArray.size() == 0) {
            throw new JsonParseException("invalid keyset: key is empty");
        }
        Keyset.Builder newBuilder = Keyset.newBuilder();
        if (jsonObject.has("primaryKeyId")) {
            int keyId = getKeyId(jsonObject.get("primaryKeyId"));
            newBuilder.copyOnWrite();
            ((Keyset) newBuilder.instance).primaryKeyId_ = keyId;
        }
        int i3 = 0;
        while (i3 < asJsonArray.size()) {
            JsonObject asJsonObject = asJsonArray.get(i3).getAsJsonObject();
            if (!asJsonObject.has("keyData") || !asJsonObject.has("status") || !asJsonObject.has("keyId") || !asJsonObject.has("outputPrefixType")) {
                throw new JsonParseException("invalid key");
            }
            JsonElement jsonElement2 = asJsonObject.get("keyData");
            if (!jsonElement2.isJsonObject()) {
                throw new JsonParseException("invalid key: keyData must be an object");
            }
            Keyset.Key.Builder newBuilder2 = Keyset.Key.newBuilder();
            String asString = asJsonObject.get("status").getAsString();
            asString.getClass();
            switch (asString.hashCode()) {
                case -891611359:
                    if (asString.equals("ENABLED")) {
                        c = 0;
                        break;
                    }
                    break;
                case 478389753:
                    if (asString.equals("DESTROYED")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1053567612:
                    if (asString.equals("DISABLED")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            c = 65535;
            switch (c) {
                case 0:
                    keyStatusType = KeyStatusType.ENABLED;
                    break;
                case 1:
                    keyStatusType = KeyStatusType.DESTROYED;
                    break;
                case 2:
                    keyStatusType = KeyStatusType.DISABLED;
                    break;
                default:
                    throw new JsonParseException("unknown status: ".concat(asString));
            }
            newBuilder2.copyOnWrite();
            Keyset.Key.access$500((Keyset.Key) newBuilder2.instance, keyStatusType);
            int keyId2 = getKeyId(asJsonObject.get("keyId"));
            newBuilder2.copyOnWrite();
            ((Keyset.Key) newBuilder2.instance).keyId_ = keyId2;
            String asString2 = asJsonObject.get("outputPrefixType").getAsString();
            asString2.getClass();
            switch (asString2.hashCode()) {
                case -2053249079:
                    if (asString2.equals("LEGACY")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 80904:
                    if (asString2.equals("RAW")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 2575090:
                    if (asString2.equals("TINK")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1761684556:
                    if (asString2.equals("CRUNCHY")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    outputPrefixType = OutputPrefixType.LEGACY;
                    break;
                case 1:
                    outputPrefixType = OutputPrefixType.RAW;
                    break;
                case 2:
                    outputPrefixType = OutputPrefixType.TINK;
                    break;
                case 3:
                    outputPrefixType = OutputPrefixType.CRUNCHY;
                    break;
                default:
                    throw new JsonParseException("unknown output prefix type: ".concat(asString2));
            }
            newBuilder2.copyOnWrite();
            Keyset.Key.access$1000((Keyset.Key) newBuilder2.instance, outputPrefixType);
            JsonObject asJsonObject2 = jsonElement2.getAsJsonObject();
            if (!asJsonObject2.has("typeUrl") || !asJsonObject2.has("value") || !asJsonObject2.has("keyMaterialType")) {
                throw new JsonParseException("invalid keyData");
            }
            byte[] bytes = asJsonObject2.get("value").getAsString().getBytes(Base64.UTF_8);
            int length = bytes.length;
            int i4 = (length * 3) / 4;
            byte[] bArr = new byte[i4];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i5 < length) {
                    int[] iArr = Hex.decode;
                    if (i6 == 0) {
                        while (true) {
                            int i9 = i5 + 4;
                            if (i9 <= length) {
                                int i10 = (iArr[bytes[i5] & 255] << 18) | (iArr[bytes[i5 + 1] & 255] << 12) | (iArr[bytes[i5 + 2] & 255] << 6) | iArr[bytes[i5 + 3] & 255];
                                if (i10 >= 0) {
                                    bArr[i8 + 2] = (byte) i10;
                                    bArr[i8 + 1] = (byte) (i10 >> 8);
                                    bArr[i8] = (byte) (i10 >> 16);
                                    i8 += 3;
                                    i5 = i9;
                                    i7 = i10;
                                } else {
                                    i7 = i10;
                                }
                            }
                        }
                        if (i5 >= length) {
                            i2 = 1;
                            i = -1;
                        }
                    }
                    int i11 = i5 + 1;
                    int i12 = iArr[bytes[i5] & 255];
                    if (i6 == 0) {
                        if (i12 < 0) {
                            if (i12 == -1) {
                            }
                        }
                        i6++;
                        i7 = i12;
                    } else if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 != 4) {
                                    if (i6 == 5) {
                                        if (i12 == -1) {
                                        }
                                    }
                                } else if (i12 == -2) {
                                    i6++;
                                } else if (i12 == -1) {
                                }
                            } else if (i12 >= 0) {
                                int i13 = i12 | (i7 << 6);
                                bArr[i8 + 2] = (byte) i13;
                                bArr[i8 + 1] = (byte) (i13 >> 8);
                                bArr[i8] = (byte) (i13 >> 16);
                                i8 += 3;
                                i7 = i13;
                                i6 = 0;
                            } else if (i12 == -2) {
                                bArr[i8 + 1] = (byte) (i7 >> 2);
                                bArr[i8] = (byte) (i7 >> 10);
                                i8 += 2;
                                i6 = 5;
                            } else if (i12 == -1) {
                            }
                        } else if (i12 >= 0) {
                            i6++;
                            i7 = i12 | (i7 << 6);
                        } else if (i12 == -2) {
                            bArr[i8] = (byte) (i7 >> 4);
                            i8++;
                            i6 = 4;
                        } else if (i12 == -1) {
                        }
                    } else if (i12 >= 0) {
                        i12 |= i7 << 6;
                        i6++;
                        i7 = i12;
                    } else if (i12 == -1) {
                    }
                    i5 = i11;
                } else {
                    i = -1;
                    i2 = 1;
                }
            }
            a$$ExternalSyntheticBUOutline0.m$3("bad base-64");
            return null;
        }
        return (Keyset) newBuilder.build();
    }
}
