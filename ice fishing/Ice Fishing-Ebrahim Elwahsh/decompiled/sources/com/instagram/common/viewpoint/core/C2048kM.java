package com.instagram.common.viewpoint.core;

import android.os.ConditionVariable;
import com.anythink.basead.exoplayer.b;
import com.anythink.core.common.n.b.a.c.k;
import com.anythink.core.common.s.a.c;
import com.anythink.expressad.foundation.g.a;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.kM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2048kM implements MP {
    public static byte[] A0B;
    public static String[] A0C = {"", "bCiwVY89t3fNm3gVh5Cta1r1ex617UD6", "2pbQHFWCVx6Uhmp9EyO9uCwpcu4x9Dl0", "32tJ4jyYWOzcf72n5Wgg62", "i6oCPG91V", "KagoX429g1hrk2zqYLocuLLyf0lslURo", "DhZpyS71VRHuUy7Qk1AUkZm91VAyIgrZ", "oeCQOWeJcqbtbEq5qioytyhoePvaJg5Z"};
    public static final HashSet<File> A0D;
    public long A00;
    public long A01;
    public MM A02;
    public boolean A03;
    public final InterfaceC2054kS A04;
    public final MV A05;
    public final C1080Mi A06;
    public final File A07;
    public final HashMap<String, ArrayList<MO>> A08;
    public final Random A09;
    public final boolean A0A;

    public static String A04(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i4);
        int i10 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0C;
            if (strArr[3].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[6] = "f7QnNjNC08rjnWmNVHuGYagSWe5Lcp9o";
            strArr2[7] = "r0Bisby3rM4igG5oRpf6tXDb0tjiDQ2I";
            if (i10 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 43);
            i10++;
        }
    }

    public static void A07() {
        A0B = new byte[]{110, 53, 41, 36, 99, 76, 77, 86, 74, 71, 80, 2, 113, 75, 79, 82, 78, 71, 97, 67, 65, 74, 71, 2, 75, 76, 81, 86, 67, 76, 65, 71, 2, 87, 81, 71, 81, 2, 86, 74, 71, 2, 68, 77, 78, 70, 71, 80, 24, 2, 114, 79, 88, 103, 91, 86, 78, 82, 69, 13, 100, 94, 90, 71, 91, 82, 116, 86, 84, 95, 82, 126, 89, 94, 67, 35, 4, 12, 9, 0, 1, 69, 17, 10, 69, 6, 23, 0, 4, 17, 0, 69, 48, 44, 33, 69, 3, 12, 9, 0, 95, 69, 31, 56, 48, 53, 60, 61, 121, 45, 54, 121, 58, 43, 60, 56, 45, 60, 121, 58, 56, 58, 49, 60, 121, 12, 16, 29, 99, 121, 108, 75, 67, 70, 79, 78, 10, 94, 69, 10, 73, 88, 79, 75, 94, 79, 10, 73, 75, 73, 66, 79, 10, 78, 67, 88, 79, 73, 94, 69, 88, 83, 16, 10, 112, 87, 95, 90, 83, 82, 22, 66, 89, 22, 95, 88, 95, 66, 95, 87, 90, 95, 76, 83, 22, 85, 87, 85, 94, 83, 22, 95, 88, 82, 95, 85, 83, 69, 12, 22, 43, 12, 4, 1, 8, 9, 77, 25, 2, 77, 1, 4, 30, 25, 77, 14, 12, 14, 5, 8, 77, 9, 4, 31, 8, 14, 25, 2, 31, 20, 77, 11, 4, 1, 8, 30, 87, 77, 48, 23, 31, 26, 19, 18, 86, 2, 25, 86, 4, 19, 27, 25, 0, 19, 86, 16, 31, 26, 19, 86, 31, 24, 18, 19, 14, 86, 19, 24, 2, 4, 15, 86, 16, 25, 4, 76, 86, 56, 20, 25, 19, 26, 7, 24, 16, 17, 85, 32, 60, 49, 85, 19, 28, 25, 16, 79, 85, 102, 92, 88, 69, 89, 80, 118, 84, 86, 93, 80, 97, 70, 93, c.f16475b, 91, 92, 85, 18, 91, 92, 86, 87, 74, 18, 84, 91, 94, 87, 18, 84, 83, 91, 94, 87, 86};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    private void A0G(File file, boolean z8, File[] fileArr, Map<String, MU> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z8) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            if (A0C[2].charAt(26) != '8') {
                String[] strArr = A0C;
                strArr[6] = "8aOt5QXsfRNGpIpRxoAxSAZDoaRpec1S";
                strArr[7] = "wFGX3oecQoVuPclALoyOBFGO19d1hLj7";
                String name = file2.getName();
                if (z8 && name.indexOf(46) == -1) {
                    A0G(file2, false, file2.listFiles(), map);
                } else {
                    if (z8) {
                        boolean A0A = C1080Mi.A0A(name);
                        if (A0C[0].length() != 2) {
                            String[] strArr2 = A0C;
                            strArr2[3] = "SjNVVRrUmgTFjXqPeyNmbh";
                            strArr2[4] = "SAWP83LvD";
                            if (!A0A) {
                                if (name.endsWith(A04(0, 4, 107))) {
                                }
                            }
                        }
                    }
                    long j9 = -1;
                    long j10 = b.f6539b;
                    MU remove = map != null ? map.remove(name) : null;
                    if (remove != null) {
                        j9 = remove.A01;
                        j10 = remove.A00;
                    }
                    C2047kL A01 = C2047kL.A01(file2, j9, j10, this.A06);
                    if (A01 != null) {
                        A0C(A01);
                    } else {
                        file2.delete();
                    }
                }
            }
            throw new RuntimeException();
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized NavigableSet<MZ> A0I(String str) {
        C1078Mg A0C2;
        AbstractC06233y.A08(!this.A03);
        A0C2 = this.A06.A0C(str);
        return (A0C2 == null || A0C2.A09()) ? new TreeSet() : new TreeSet((Collection) A0C2.A06());
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized long A7B(String str, long j9, long j10) {
        long j11;
        long j12 = j9;
        synchronized (this) {
            long j13 = j10 == -1 ? Long.MAX_VALUE : j12 + j10;
            if (j13 < 0) {
                j13 = Long.MAX_VALUE;
            }
            j11 = 0;
            while (j12 < j13) {
                long A7C = A7C(str, j12, j13 - j12);
                if (A7C > 0) {
                    j11 += A7C;
                } else {
                    A7C = -A7C;
                }
                j12 += A7C;
            }
        }
        return j11;
    }

    static {
        A07();
        A0D = new HashSet<>();
    }

    @Deprecated
    public C2048kM(File file, InterfaceC2054kS interfaceC2054kS) {
        this(file, interfaceC2054kS, (byte[]) null, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2048kM(File file, InterfaceC2054kS interfaceC2054kS, C5O c5o, byte[] bArr, boolean z8, boolean z9) {
        this(file, interfaceC2054kS, r1, r0);
        MV mv;
        C1080Mi c1080Mi = new C1080Mi(c5o, file, bArr, z8, z9);
        if (c5o != null && !z9) {
            mv = new MV(c5o);
        } else {
            mv = null;
        }
    }

    public C2048kM(File file, InterfaceC2054kS interfaceC2054kS, C1080Mi c1080Mi, MV mv) {
        if (A0H(file)) {
            this.A07 = file;
            this.A04 = interfaceC2054kS;
            this.A06 = c1080Mi;
            this.A05 = mv;
            this.A08 = new HashMap<>();
            this.A09 = new Random();
            this.A0A = interfaceC2054kS.AIj();
            this.A01 = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new C1087Mp(this, A04(50, 25, 28), conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException(A04(4, 46, 9) + file);
    }

    @Deprecated
    public C2048kM(File file, InterfaceC2054kS interfaceC2054kS, byte[] bArr, boolean z8) {
        this(file, interfaceC2054kS, null, bArr, z8, true);
    }

    public static long A00(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, Long.toString(abs, 16) + A04(0, 4, 107));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException(A04(75, 27, 78) + file2);
    }

    public static long A01(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    public static long A02(File[] fileArr) {
        for (File file : fileArr) {
            String fileName = file.getName();
            if (fileName.endsWith(A04(0, 4, 107))) {
                try {
                    return A01(fileName);
                } catch (NumberFormatException unused) {
                    AbstractC06314g.A05(A04(a.aZ, 11, 30), A04(277, 20, 94) + file);
                    file.delete();
                }
            }
        }
        return -1L;
    }

    private C2047kL A03(String str, long j9, long j10) {
        C2047kL A04;
        C1078Mg A0C2 = this.A06.A0C(str);
        if (A0C2 == null) {
            return C2047kL.A04(str, j9, j10);
        }
        while (true) {
            A04 = A0C2.A04(j9, j10);
            if (!A04.A05 || A04.A03.length() == A04.A01) {
                break;
            }
            A06();
        }
        return A04;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (!this.A07.exists()) {
            try {
                A0F(this.A07);
            } catch (MM e6) {
                this.A02 = e6;
                return;
            }
        }
        File file = this.A07;
        String[] strArr = A0C;
        if (strArr[6].charAt(20) == strArr[7].charAt(20)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0C;
        strArr2[1] = "a7bsaZYeTJGewaTpvlEBtyxkDQTMEU8W";
        strArr2[5] = "kn4PmWwOChlyCy8qyQNRjkcz1fm49U24";
        File[] listFiles = file.listFiles();
        String A04 = A04(a.aZ, 11, 30);
        if (listFiles == null) {
            String str = A04(200, 38, 70) + this.A07;
            AbstractC06314g.A05(A04, str);
            this.A02 = new MM(str);
            return;
        }
        this.A01 = A02(listFiles);
        if (this.A01 == -1) {
            try {
                this.A01 = A00(this.A07);
            } catch (IOException e9) {
                String str2 = A04(102, 28, 114) + this.A07;
                AbstractC06314g.A08(A04, str2, e9);
                this.A02 = new MM(str2, e9);
                return;
            }
        }
        try {
            this.A06.A0J(this.A01);
            if (this.A05 != null) {
                this.A05.A06(this.A01);
                Map<String, MU> A05 = this.A05.A05();
                A0G(this.A07, true, listFiles, A05);
                this.A05.A09(A05.keySet());
            } else {
                A0G(this.A07, true, listFiles, null);
            }
            this.A06.A0H();
            try {
                this.A06.A0I();
            } catch (IOException e10) {
                AbstractC06314g.A08(A04, A04(k.f15229b, 25, 25), e10);
            }
        } catch (IOException e11) {
            String str3 = A04(164, 36, 29) + this.A07;
            AbstractC06314g.A08(A04, str3, e11);
            this.A02 = new MM(str3, e11);
        }
    }

    private void A06() {
        ArrayList arrayList = new ArrayList();
        Iterator<C1078Mg> it = this.A06.A0G().iterator();
        while (it.hasNext()) {
            Iterator<C2047kL> it2 = it.next().A06().iterator();
            while (it2.hasNext()) {
                C2047kL next = it2.next();
                if (next.A03.length() != next.A01) {
                    arrayList.add(next);
                }
            }
        }
        int i = 0;
        while (true) {
            int size = arrayList.size();
            String[] strArr = A0C;
            String str = strArr[1];
            String str2 = strArr[5];
            int i4 = str.charAt(29);
            if (i4 != str2.charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "aqjjwslhzF6rAKukFAflKhlVTVCMUUBi";
            strArr2[5] = "oi6ATHfePUfqMvf6S7GQLdSJgMPLAUWw";
            if (i < size) {
                A0A((MZ) arrayList.get(i));
                i++;
            } else {
                return;
            }
        }
    }

    private final synchronized void A08() throws MM {
        if (this.A02 != null) {
            throw this.A02;
        }
    }

    private void A09(MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(mz.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG3(this, mz);
            }
        }
        this.A04.AG3(this, mz);
    }

    private void A0A(MZ mz) {
        C1078Mg A0C2 = this.A06.A0C(mz.A04);
        if (A0C2 == null || !A0C2.A0D(mz)) {
            return;
        }
        this.A00 -= mz.A01;
        if (this.A05 != null) {
            String name = mz.A03.getName();
            try {
                this.A05.A07(name);
            } catch (IOException unused) {
                AbstractC06314g.A07(A04(a.aZ, 11, 30), A04(238, 39, 93) + name);
            }
        }
        this.A06.A0K(A0C2.A02);
        A09(mz);
    }

    private void A0C(C2047kL c2047kL) {
        this.A06.A0D(c2047kL.A04).A08(c2047kL);
        this.A00 += c2047kL.A01;
        A0D(c2047kL);
    }

    private void A0D(C2047kL c2047kL) {
        ArrayList<MO> arrayList = this.A08.get(c2047kL.A04);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MO mo = arrayList.get(size);
                int i = A0C[0].length();
                if (i == 2) {
                    throw new RuntimeException();
                }
                A0C[0] = "Z81vyiSZneiyPRnyPjjjzGlAG4UB";
                mo.AG2(this, c2047kL);
            }
        }
        this.A04.AG2(this, c2047kL);
    }

    private void A0E(C2047kL c2047kL, MZ mz) {
        ArrayList<MO> arrayList = this.A08.get(c2047kL.A04);
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; i--) {
                arrayList.get(i).AG4(this, c2047kL, mz);
            }
        }
        this.A04.AG4(this, c2047kL, mz);
    }

    public static void A0F(File file) throws MM {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = A04(com.anythink.expressad.video.module.a.a.f21889U, 34, 1) + file;
        String message = A04(a.aZ, 11, 30);
        AbstractC06314g.A05(message, str);
        throw new MM(str);
    }

    public static synchronized boolean A0H(File file) {
        boolean add;
        synchronized (C2048kM.class) {
            add = A0D.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized void A4E(String str, C1083Ml c1083Ml) throws MM {
        AbstractC06233y.A08(!this.A03);
        A08();
        this.A06.A0L(str, c1083Ml);
        try {
            this.A06.A0I();
        } catch (IOException e6) {
            throw new MM(e6);
        }
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized void A55(File file, long j9) throws MM {
        AbstractC06233y.A08(!this.A03);
        if (file.exists()) {
            if (j9 == 0) {
                file.delete();
                return;
            }
            C2047kL c2047kL = (C2047kL) AbstractC06233y.A01(C2047kL.A02(file, j9, this.A06));
            C1078Mg c1078Mg = (C1078Mg) AbstractC06233y.A01(this.A06.A0C(c2047kL.A04));
            AbstractC06233y.A08(c1078Mg.A0B(c2047kL.A02, c2047kL.A01));
            long A00 = AbstractC1081Mj.A00(c1078Mg.A03());
            if (A00 != -1) {
                AbstractC06233y.A08(c2047kL.A02 + c2047kL.A01 <= A00);
            }
            if (this.A05 != null) {
                try {
                    this.A05.A08(file.getName(), c2047kL.A01, c2047kL.A00);
                } catch (IOException e6) {
                    throw new MM(e6);
                }
            }
            A0C(c2047kL);
            try {
                this.A06.A0I();
                notifyAll();
            } catch (IOException e9) {
                throw new MM(e9);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized long A7A() {
        AbstractC06233y.A08(!this.A03);
        return this.A00;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    @MetaExoPlayerCustomization
    public final synchronized long A7C(String str, long j9, long j10) {
        C1078Mg cachedContent;
        AbstractC06233y.A08(!this.A03);
        if (j10 == -1) {
            j10 = Long.MAX_VALUE;
        }
        cachedContent = this.A06.A0C(str);
        return cachedContent != null ? cachedContent.A02(j9, j10) : -j10;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized InterfaceC1082Mk A7S(String str) {
        AbstractC06233y.A08(!this.A03);
        return this.A06.A0E(str);
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized void AHg(MZ mz) {
        AbstractC06233y.A08(!this.A03);
        C1078Mg c1078Mg = (C1078Mg) AbstractC06233y.A01(this.A06.A0C(mz.A04));
        c1078Mg.A07(mz.A02);
        this.A06.A0K(c1078Mg.A02);
        notifyAll();
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized void AIU(String str) {
        AbstractC06233y.A08(!this.A03);
        Iterator<MZ> it = A0I(str).iterator();
        while (it.hasNext()) {
            A0A(it.next());
        }
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized void AIV(MZ mz) {
        AbstractC06233y.A08(!this.A03);
        A0A(mz);
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized File AK8(String str, long lastTouchTimestamp, long j9) throws MM {
        C1078Mg A0C2;
        File file;
        AbstractC06233y.A08(!this.A03);
        A08();
        A0C2 = this.A06.A0C(str);
        AbstractC06233y.A01(A0C2);
        AbstractC06233y.A08(A0C2.A0B(lastTouchTimestamp, j9));
        if (!this.A07.exists()) {
            A0F(this.A07);
            A06();
        }
        this.A04.AG5(this, str, lastTouchTimestamp, j9);
        file = new File(this.A07, Integer.toString(this.A09.nextInt(10)));
        if (!file.exists()) {
            A0F(file);
        }
        return C2047kL.A05(file, A0C2.A01, lastTouchTimestamp, System.currentTimeMillis());
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized MZ AKA(String str, long j9, long j10, MN mn) throws InterruptedException, MM {
        MZ span;
        AbstractC06233y.A08(!this.A03);
        A08();
        while (true) {
            span = AKB(str, j9, j10, mn);
            if (span == null) {
                wait();
            }
        }
        return span;
    }

    @Override // com.instagram.common.viewpoint.core.MP
    public final synchronized C2047kL AKB(String str, long j9, long j10, MN mn) throws MM {
        AbstractC06233y.A08(!this.A03);
        A08();
        C2047kL A03 = A03(str, j9, j10);
        if (A03.A05) {
            C2047kL span = this.A06.A0C(str).A05(A03, A03.A00, false);
            A0E(A03, span);
            return span;
        }
        if (this.A06.A0D(str).A0C(j9, A03.A01)) {
            return A03;
        }
        return null;
    }
}
