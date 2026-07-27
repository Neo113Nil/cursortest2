package kotlin.text;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CatchingFishWebSocketMockk implements Serializable, Comparable {
    public static final CatchingFishWebSocketMockk CatchingFishViewModelScope = new CatchingFishWebSocketMockk(new byte[0]);
    public transient int CatchingFishDaggerWebsocket;
    public final byte[] CatchingFishReduxKtor;
    public transient String CatchingFishWorkManager;

    public CatchingFishWebSocketMockk(byte[] bArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "data");
        this.CatchingFishReduxKtor = bArr;
    }

    public static final CatchingFishWebSocketMockk CatchingFishSnackbar(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (CatchingFishRobolectricHilt.CatchingFishWorkManager(str.charAt(i2 + 1)) + (CatchingFishRobolectricHilt.CatchingFishWorkManager(str.charAt(i2)) << 4));
        }
        return new CatchingFishWebSocketMockk(bArr);
    }

    public static final CatchingFishWebSocketMockk CatchingFishViewModelFAB(byte... bArr) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "data");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
        return new CatchingFishWebSocketMockk(copyOf);
    }

    public CatchingFishWebSocketMockk CatchingFishCloudMessaging() {
        int i = 0;
        while (true) {
            byte[] bArr = this.CatchingFishReduxKtor;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new CatchingFishWebSocketMockk(copyOf);
            }
            i++;
        }
    }

    public CatchingFishWebSocketMockk CatchingFishCoroutine(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.CatchingFishReduxKtor, 0, CatchingFishReduxKtor());
        byte[] digest = messageDigest.digest();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(digest, "digestBytes");
        return new CatchingFishWebSocketMockk(digest);
    }

    public String CatchingFishDaggerWebsocket() {
        byte[] bArr = this.CatchingFishReduxKtor;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = CatchingFishRobolectricHilt.CatchingFishReduxKtor;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public final String CatchingFishEspressoTesting() {
        String str = this.CatchingFishWorkManager;
        if (str != null) {
            return str;
        }
        byte[] CatchingFishWorkManager = CatchingFishWorkManager();
        CatchingFishFirebaseDagger.CatchingFishNavigation(CatchingFishWorkManager, "<this>");
        String str2 = new String(CatchingFishWorkManager, CatchingFishOkHttpToast.CatchingFishParcelableFAB);
        this.CatchingFishWorkManager = str2;
        return str2;
    }

    public boolean CatchingFishFragmentHandler(int i, byte[] bArr, int i2, int i3) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "other");
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.CatchingFishReduxKtor;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && CatchingFishXMLLayoutGlide.CatchingFishCloudMessaging(i, i2, i3, bArr2, bArr);
    }

    public boolean CatchingFishLayout(int i, CatchingFishWebSocketMockk catchingFishWebSocketMockk) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebSocketMockk, "other");
        return catchingFishWebSocketMockk.CatchingFishFragmentHandler(0, this.CatchingFishReduxKtor, 0, i);
    }

    public void CatchingFishOkHttp(CatchingFishWidgetGradle catchingFishWidgetGradle, int i) {
        catchingFishWidgetGradle.CatchingFishParcelableFlux(this.CatchingFishReduxKtor, i);
    }

    public String CatchingFishParcelableFAB() {
        byte[] bArr = CatchingFishPagingLibrary.CatchingFishParcelableFAB;
        byte[] bArr2 = this.CatchingFishReduxKtor;
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr2, "<this>");
        CatchingFishFirebaseDagger.CatchingFishNavigation(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr2[i];
            int i3 = i + 2;
            byte b2 = bArr2[i + 1];
            i += 3;
            byte b3 = bArr2[i3];
            bArr3[i2] = bArr[(b & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr[b3 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b4 = bArr2[i];
            bArr3[i2] = bArr[(b4 & 255) >> 2];
            bArr3[i2 + 1] = bArr[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr2[i];
            byte b6 = bArr2[i5];
            bArr3[i2] = bArr[(b5 & 255) >> 2];
            bArr3[i2 + 1] = bArr[((b5 & 3) << 4) | ((b6 & 255) >> 4)];
            bArr3[i2 + 2] = bArr[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, CatchingFishOkHttpToast.CatchingFishParcelableFAB);
    }

    public int CatchingFishReduxKtor() {
        return this.CatchingFishReduxKtor.length;
    }

    public byte CatchingFishViewModelScope(int i) {
        return this.CatchingFishReduxKtor[i];
    }

    public byte[] CatchingFishWorkManager() {
        return this.CatchingFishReduxKtor;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        CatchingFishWebSocketMockk catchingFishWebSocketMockk = (CatchingFishWebSocketMockk) obj;
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebSocketMockk, "other");
        int CatchingFishReduxKtor = CatchingFishReduxKtor();
        int CatchingFishReduxKtor2 = catchingFishWebSocketMockk.CatchingFishReduxKtor();
        int min = Math.min(CatchingFishReduxKtor, CatchingFishReduxKtor2);
        for (int i = 0; i < min; i++) {
            int CatchingFishViewModelScope2 = CatchingFishViewModelScope(i) & 255;
            int CatchingFishViewModelScope3 = catchingFishWebSocketMockk.CatchingFishViewModelScope(i) & 255;
            if (CatchingFishViewModelScope2 != CatchingFishViewModelScope3) {
                return CatchingFishViewModelScope2 < CatchingFishViewModelScope3 ? -1 : 1;
            }
        }
        if (CatchingFishReduxKtor == CatchingFishReduxKtor2) {
            return 0;
        }
        return CatchingFishReduxKtor < CatchingFishReduxKtor2 ? -1 : 1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CatchingFishWebSocketMockk) {
            CatchingFishWebSocketMockk catchingFishWebSocketMockk = (CatchingFishWebSocketMockk) obj;
            int CatchingFishReduxKtor = catchingFishWebSocketMockk.CatchingFishReduxKtor();
            byte[] bArr = this.CatchingFishReduxKtor;
            if (CatchingFishReduxKtor == bArr.length && catchingFishWebSocketMockk.CatchingFishFragmentHandler(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.CatchingFishDaggerWebsocket;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.CatchingFishReduxKtor);
        this.CatchingFishDaggerWebsocket = hashCode;
        return hashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x00f6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0130, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0134, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x00d6, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0173, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x017a, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x016c, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01aa, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01ad, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01b0, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0140, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x01b3, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0096, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c4, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0085, code lost:
    
        if (r6 == 64) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        if (r6 == 64) goto L180;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String toString() {
        CatchingFishWebSocketMockk catchingFishWebSocketMockk;
        byte b;
        int i;
        byte[] bArr = this.CatchingFishReduxKtor;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                int i5 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 != 10 && b2 != 13 && ((b2 >= 0 && b2 < 32) || (Byte.MAX_VALUE <= b2 && b2 < 160))) || b2 == 65533) {
                    break;
                }
                i3 += b2 < 65536 ? 1 : 2;
                i2++;
                while (true) {
                    i4 = i5;
                    if (i2 < length && (b = bArr[i2]) >= 0) {
                        i2++;
                        i5 = i4 + 1;
                        if (i4 == 64) {
                            break loop0;
                        }
                        if ((b != 10 && b != 13 && ((b >= 0 && b < 32) || (Byte.MAX_VALUE <= b && b < 160))) || b == 65533) {
                            break loop0;
                        }
                        i3 += b < 65536 ? 1 : 2;
                    }
                }
            } else if ((b2 >> 5) == -2) {
                int i6 = i2 + 1;
                if (length > i6) {
                    byte b3 = bArr[i6];
                    if ((b3 & 192) == 128) {
                        int i7 = (b3 ^ 3968) ^ (b2 << 6);
                        if (i7 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (127 <= i7 && i7 < 160))) || i7 == 65533) {
                                break;
                            }
                            i3 += i7 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        }
                    }
                }
            } else if ((b2 >> 4) == -2) {
                int i8 = i2 + 2;
                if (length > i8) {
                    byte b4 = bArr[i2 + 1];
                    if ((b4 & 192) == 128) {
                        byte b5 = bArr[i8];
                        if ((b5 & 192) == 128) {
                            int i9 = ((b5 ^ (-123008)) ^ (b4 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 > i9 || i9 >= 57344) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 32) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                        break;
                                    }
                                    i3 += i9 < 65536 ? 1 : 2;
                                    i2 += 3;
                                    i4 = i;
                                }
                            }
                        }
                    }
                }
            } else if ((b2 >> 3) == -2) {
                int i10 = i2 + 3;
                if (length > i10) {
                    byte b6 = bArr[i2 + 1];
                    if ((b6 & 192) == 128) {
                        byte b7 = bArr[i2 + 2];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i10];
                            if ((b8 & 192) == 128) {
                                int i11 = (((b8 ^ 3678080) ^ (b7 << 6)) ^ (b6 << 12)) ^ (b2 << 18);
                                if (i11 <= 1114111) {
                                    if (55296 > i11 || i11 >= 57344) {
                                        if (i11 >= 65536) {
                                            i = i4 + 1;
                                            if (i4 == 64) {
                                                break;
                                            }
                                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                                break;
                                            }
                                            i3 += i11 < 65536 ? 1 : 2;
                                            i2 += 4;
                                            i4 = i;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (i3 != -1) {
            String CatchingFishEspressoTesting = CatchingFishEspressoTesting();
            String substring = CatchingFishEspressoTesting.substring(0, i3);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            String CatchingFishEspressoMockk = CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(CatchingFishRoomMVVMWidget.CatchingFishEspressoMockk(substring, "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= CatchingFishEspressoTesting.length()) {
                return "[text=" + CatchingFishEspressoMockk + ']';
            }
            return "[size=" + bArr.length + " text=" + CatchingFishEspressoMockk + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + CatchingFishDaggerWebsocket() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(CatchingFishMVPLiveData.CatchingFishAnimationMockk(new StringBuilder("endIndex > length("), bArr.length, ')').toString());
        }
        if (64 == bArr.length) {
            catchingFishWebSocketMockk = this;
        } else {
            CatchingFishXMLLayoutGlide.CatchingFishRoomDatabase(64, bArr.length);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 64);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOfRange, "copyOfRange(...)");
            catchingFishWebSocketMockk = new CatchingFishWebSocketMockk(copyOfRange);
        }
        sb.append(catchingFishWebSocketMockk.CatchingFishDaggerWebsocket());
        sb.append("…]");
        return sb.toString();
    }
}
