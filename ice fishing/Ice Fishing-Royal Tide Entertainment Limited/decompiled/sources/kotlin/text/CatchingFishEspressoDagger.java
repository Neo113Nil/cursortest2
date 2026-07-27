package kotlin.text;

import java.io.Closeable;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class CatchingFishEspressoDagger {
    public static final CatchingFishKtorStripeAPI CatchingFishCoroutine;
    public static final TimeZone CatchingFishDaggerWebsocket;
    public static final CatchingFishGsonLifecycle CatchingFishReduxKtor;
    public static final Pattern CatchingFishViewModelFAB;
    public static final Method CatchingFishViewModelScope;
    public static final CatchingFishToolbarRedux CatchingFishWorkManager;
    public static final byte[] CatchingFishParcelableFAB = new byte[0];
    public static final String[] CatchingFishSnackbar = new String[0];

    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cb, code lost:
    
        continue;
     */
    static {
        Method method;
        int i;
        int i2 = 0;
        String[] strArr = (String[]) new String[0].clone();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            String str = strArr[i3];
            if (str == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr[i3] = str.trim();
        }
        for (int i4 = 0; i4 < strArr.length; i4 += 2) {
            String str2 = strArr[i4];
            String str3 = strArr[i4 + 1];
            CatchingFishKtorStripeAPI.CatchingFishParcelableFAB(str2);
            CatchingFishKtorStripeAPI.CatchingFishSnackbar(str3, str2);
        }
        CatchingFishCoroutine = new CatchingFishKtorStripeAPI(strArr);
        byte[] bArr = CatchingFishParcelableFAB;
        CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
        catchingFishWidgetGradle.m12write(bArr);
        long j = 0;
        CatchingFishReduxKtor = new CatchingFishGsonLifecycle(j, catchingFishWidgetGradle, 1);
        if (j < 0 || j > j || 0 < j) {
            throw new ArrayIndexOutOfBoundsException();
        }
        CatchingFishWebSocketMockk[] catchingFishWebSocketMockkArr = {CatchingFishWebSocketMockk.CatchingFishSnackbar("efbbbf"), CatchingFishWebSocketMockk.CatchingFishSnackbar("feff"), CatchingFishWebSocketMockk.CatchingFishSnackbar("fffe"), CatchingFishWebSocketMockk.CatchingFishSnackbar("0000ffff"), CatchingFishWebSocketMockk.CatchingFishSnackbar("ffff0000")};
        ArrayList arrayList = new ArrayList(new CatchingFishLiveDataCameraX(catchingFishWebSocketMockkArr, false));
        if (arrayList.size() > 1) {
            Collections.sort(arrayList);
        }
        ArrayList arrayList2 = new ArrayList(5);
        for (int i5 = 0; i5 < 5; i5++) {
            CatchingFishWebSocketMockk catchingFishWebSocketMockk = catchingFishWebSocketMockkArr[i5];
            arrayList2.add(-1);
        }
        Integer[] numArr = (Integer[]) arrayList2.toArray(new Integer[0]);
        Object[] copyOf = Arrays.copyOf(numArr, numArr.length);
        CatchingFishFirebaseDagger.CatchingFishNavigation(copyOf, "elements");
        ArrayList arrayList3 = copyOf.length == 0 ? new ArrayList() : new ArrayList(new CatchingFishLiveDataCameraX(copyOf, true));
        int i6 = 0;
        int i7 = 0;
        while (i6 < 5) {
            CatchingFishWebSocketMockk catchingFishWebSocketMockk2 = catchingFishWebSocketMockkArr[i6];
            int i8 = i7 + 1;
            int size = arrayList.size();
            int size2 = arrayList.size();
            if (size < 0) {
                throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
            }
            if (size > size2) {
                throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
            }
            int i9 = size - 1;
            int i10 = 0;
            while (true) {
                if (i10 > i9) {
                    i = -(i10 + 1);
                    break;
                }
                i = (i10 + i9) >>> 1;
                int CatchingFishRoomDatabase = CatchingFishAdMobFAB.CatchingFishRoomDatabase((Comparable) arrayList.get(i), catchingFishWebSocketMockk2);
                if (CatchingFishRoomDatabase < 0) {
                    i10 = i + 1;
                } else if (CatchingFishRoomDatabase > 0) {
                    i9 = i - 1;
                }
            }
            arrayList3.set(i, Integer.valueOf(i7));
            i6++;
            i7 = i8;
        }
        if (((CatchingFishWebSocketMockk) arrayList.get(0)).CatchingFishReduxKtor() <= 0) {
            throw new IllegalArgumentException("the empty byte string is not a supported option");
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            CatchingFishWebSocketMockk catchingFishWebSocketMockk3 = (CatchingFishWebSocketMockk) arrayList.get(i11);
            int i12 = i11 + 1;
            int i13 = i12;
            while (i13 < arrayList.size()) {
                CatchingFishWebSocketMockk catchingFishWebSocketMockk4 = (CatchingFishWebSocketMockk) arrayList.get(i13);
                catchingFishWebSocketMockk4.getClass();
                CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishWebSocketMockk3, "prefix");
                if (catchingFishWebSocketMockk4.CatchingFishLayout(catchingFishWebSocketMockk3.CatchingFishReduxKtor(), catchingFishWebSocketMockk3)) {
                    if (catchingFishWebSocketMockk4.CatchingFishReduxKtor() == catchingFishWebSocketMockk3.CatchingFishReduxKtor()) {
                        throw new IllegalArgumentException(("duplicate option: " + catchingFishWebSocketMockk4).toString());
                    }
                    if (((Number) arrayList3.get(i13)).intValue() > ((Number) arrayList3.get(i11)).intValue()) {
                        arrayList.remove(i13);
                        arrayList3.remove(i13);
                    } else {
                        i13++;
                    }
                }
            }
            i11 = i12;
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle2 = new CatchingFishWidgetGradle();
        CatchingFishOkHttpFAB.CatchingFishReduxKtor(0L, catchingFishWidgetGradle2, 0, arrayList, 0, arrayList.size(), arrayList3);
        int[] iArr = new int[(int) (catchingFishWidgetGradle2.CatchingFishDaggerWebsocket / 4)];
        while (!catchingFishWidgetGradle2.CatchingFishReduxKtor()) {
            iArr[i2] = catchingFishWidgetGradle2.readInt();
            i2++;
        }
        Object[] copyOf2 = Arrays.copyOf(catchingFishWebSocketMockkArr, 5);
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(this, size)");
        Charset.forName("UTF-32BE");
        Charset.forName("UTF-32LE");
        CatchingFishDaggerWebsocket = TimeZone.getTimeZone("GMT");
        CatchingFishWorkManager = new CatchingFishToolbarRedux(6);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class);
        } catch (Exception unused) {
            method = null;
        }
        CatchingFishViewModelScope = method;
        CatchingFishViewModelFAB = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    public static int CatchingFishAnimationMockk(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static boolean CatchingFishCloudMessaging(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static void CatchingFishCoroutine(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!CatchingFishCloudMessaging(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InetAddress CatchingFishDaggerWebsocket(String str, int i, int i2) {
        int i3;
        byte[] bArr = new byte[16];
        int i4 = i;
        int i5 = 0;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            if (i5 == 16) {
                return null;
            }
            int i8 = i4 + 2;
            if (i8 <= i2 && str.regionMatches(i4, "::", 0, 2)) {
                if (i6 != -1) {
                    return null;
                }
                i5 += 2;
                i6 = i5;
                if (i8 == i2) {
                    break;
                }
                i7 = i8;
                int i9 = 0;
                i4 = i7;
                while (i4 < i2) {
                }
                i3 = i4 - i7;
                return i3 == 0 ? null : null;
            }
            if (i5 != 0) {
                if (str.regionMatches(i4, ":", 0, 1)) {
                    i4++;
                } else {
                    if (!str.regionMatches(i4, ".", 0, 1)) {
                        return null;
                    }
                    int i10 = i5 - 2;
                    int i11 = i10;
                    while (i7 < i2) {
                        if (i11 == 16) {
                            return null;
                        }
                        if (i11 != i10) {
                            if (str.charAt(i7) != '.') {
                                return null;
                            }
                            i7++;
                        }
                        int i12 = 0;
                        int i13 = i7;
                        while (i13 < i2) {
                            char charAt = str.charAt(i13);
                            if (charAt < '0' || charAt > '9') {
                                break;
                            }
                            if ((i12 == 0 && i7 != i13) || ((i12 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i13++;
                        }
                        if (i13 - i7 == 0) {
                            return null;
                        }
                        bArr[i11] = (byte) i12;
                        i11++;
                        i7 = i13;
                    }
                    if (i11 != i5 + 2) {
                        return null;
                    }
                    i5 += 2;
                }
            }
            i7 = i4;
            int i92 = 0;
            i4 = i7;
            while (i4 < i2) {
                int CatchingFishReduxKtor2 = CatchingFishReduxKtor(str.charAt(i4));
                if (CatchingFishReduxKtor2 == -1) {
                    break;
                }
                i92 = (i92 << 4) + CatchingFishReduxKtor2;
                i4++;
            }
            i3 = i4 - i7;
            if (i3 == 0 && i3 <= 4) {
                int i14 = i5 + 1;
                bArr[i5] = (byte) (255 & (i92 >>> 8));
                i5 += 2;
                bArr[i14] = (byte) (i92 & 255);
            }
        }
        if (i5 != 16) {
            if (i6 == -1) {
                return null;
            }
            int i15 = i5 - i6;
            System.arraycopy(bArr, i6, bArr, 16 - i15, i15);
            Arrays.fill(bArr, i6, (16 - i5) + i6, (byte) 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    public static boolean CatchingFishEspressoTesting(Comparator comparator, String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 != null && strArr.length != 0 && strArr2.length != 0) {
            for (String str : strArr) {
                for (String str2 : strArr2) {
                    if (comparator.compare(str, str2) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static String[] CatchingFishFragmentHandler(Comparator comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i++;
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static List CatchingFishLayout(Object... objArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) objArr.clone()));
    }

    public static boolean CatchingFishOkHttp(CatchingFishBundleView catchingFishBundleView, CatchingFishBundleView catchingFishBundleView2) {
        return catchingFishBundleView.CatchingFishReduxKtor.equals(catchingFishBundleView2.CatchingFishReduxKtor) && catchingFishBundleView.CatchingFishDaggerWebsocket == catchingFishBundleView2.CatchingFishDaggerWebsocket && catchingFishBundleView.CatchingFishParcelableFAB.equals(catchingFishBundleView2.CatchingFishParcelableFAB);
    }

    public static String CatchingFishParcelableFAB(String str) {
        int i = -1;
        int i2 = 0;
        if (!str.contains(":")) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                while (i2 < lowerCase.length()) {
                    char charAt = lowerCase.charAt(i2);
                    if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                        return null;
                    }
                    i2++;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress CatchingFishDaggerWebsocket2 = (str.startsWith("[") && str.endsWith("]")) ? CatchingFishDaggerWebsocket(str, 1, str.length() - 1) : CatchingFishDaggerWebsocket(str, 0, str.length());
        if (CatchingFishDaggerWebsocket2 == null) {
            return null;
        }
        byte[] address = CatchingFishDaggerWebsocket2.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return CatchingFishDaggerWebsocket2.getHostAddress();
            }
            throw new AssertionError(CatchingFishMVPLiveData.CatchingFishOkHttp("Invalid IPv6 address: '", str, "'"));
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < address.length) {
            int i5 = i3;
            while (i5 < 16 && address[i5] == 0 && address[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i3;
            if (i6 > i4 && i6 >= 4) {
                i = i3;
                i4 = i6;
            }
            i3 = i5 + 2;
        }
        CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
        while (i2 < address.length) {
            if (i2 == i) {
                catchingFishWidgetGradle.CatchingFishCardViewView(58);
                i2 += i4;
                if (i2 == 16) {
                    catchingFishWidgetGradle.CatchingFishCardViewView(58);
                }
            } else {
                if (i2 > 0) {
                    catchingFishWidgetGradle.CatchingFishCardViewView(58);
                }
                catchingFishWidgetGradle.CatchingFishMVPRobolectric(((address[i2] & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return catchingFishWidgetGradle.CatchingFishStateLiveData();
    }

    public static int CatchingFishReduxKtor(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public static CatchingFishKtorStripeAPI CatchingFishRoomDatabase(ArrayList arrayList) {
        CatchingFishViewPagerMockk catchingFishViewPagerMockk = new CatchingFishViewPagerMockk(12);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            CatchingFishXMLLayoutFAB catchingFishXMLLayoutFAB = (CatchingFishXMLLayoutFAB) obj;
            CatchingFishWidgetContext catchingFishWidgetContext = CatchingFishWidgetContext.CatchingFishUnitTesting;
            String CatchingFishEspressoTesting = catchingFishXMLLayoutFAB.CatchingFishParcelableFAB.CatchingFishEspressoTesting();
            String CatchingFishEspressoTesting2 = catchingFishXMLLayoutFAB.CatchingFishSnackbar.CatchingFishEspressoTesting();
            catchingFishWidgetContext.getClass();
            catchingFishViewPagerMockk.CatchingFishViewModelScope(CatchingFishEspressoTesting, CatchingFishEspressoTesting2);
        }
        return new CatchingFishKtorStripeAPI(catchingFishViewPagerMockk);
    }

    public static void CatchingFishSnackbar(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    public static int CatchingFishStateLiveData(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != '\t' && charAt != '\n' && charAt != '\f' && charAt != '\r' && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    public static boolean CatchingFishUnitTesting(CatchingFishGradleStripeAPI catchingFishGradleStripeAPI, int i) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long nanoTime = System.nanoTime();
        long CatchingFishCoroutine2 = catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishDaggerWebsocket() ? catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishCoroutine() - nanoTime : Long.MAX_VALUE;
        catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishReduxKtor(Math.min(CatchingFishCoroutine2, timeUnit.toNanos(i)) + nanoTime);
        try {
            CatchingFishWidgetGradle catchingFishWidgetGradle = new CatchingFishWidgetGradle();
            while (catchingFishGradleStripeAPI.CatchingFishSpannableWidget(catchingFishWidgetGradle, 8192L) != -1) {
                catchingFishWidgetGradle.skip(catchingFishWidgetGradle.CatchingFishDaggerWebsocket);
            }
            if (CatchingFishCoroutine2 == Long.MAX_VALUE) {
                catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishParcelableFAB();
                return true;
            }
            catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishReduxKtor(nanoTime + CatchingFishCoroutine2);
            return true;
        } catch (InterruptedIOException unused) {
            if (CatchingFishCoroutine2 == Long.MAX_VALUE) {
                catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishParcelableFAB();
                return false;
            }
            catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishReduxKtor(nanoTime + CatchingFishCoroutine2);
            return false;
        } catch (Throwable th) {
            if (CatchingFishCoroutine2 == Long.MAX_VALUE) {
                catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishParcelableFAB();
            } else {
                catchingFishGradleStripeAPI.CatchingFishParcelableFAB().CatchingFishReduxKtor(nanoTime + CatchingFishCoroutine2);
            }
            throw th;
        }
    }

    public static String CatchingFishViewModelFAB(CatchingFishBundleView catchingFishBundleView, boolean z) {
        String str = catchingFishBundleView.CatchingFishReduxKtor;
        int i = catchingFishBundleView.CatchingFishDaggerWebsocket;
        if (str.contains(":")) {
            str = CatchingFishMVPLiveData.CatchingFishOkHttp("[", str, "]");
        }
        if (!z && i == CatchingFishBundleView.CatchingFishSnackbar(catchingFishBundleView.CatchingFishParcelableFAB)) {
            return str;
        }
        return str + ":" + i;
    }

    public static int CatchingFishViewModelScope(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int CatchingFishWorkManager(int i, int i2, String str, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
