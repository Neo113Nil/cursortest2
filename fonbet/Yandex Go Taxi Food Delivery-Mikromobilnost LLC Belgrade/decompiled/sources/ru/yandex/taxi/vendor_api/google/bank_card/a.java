package ru.yandex.taxi.vendor_api.google.bank_card;

import android.graphics.Rect;
import android.media.Image;
import android.view.View;
import defpackage.bvu0;
import defpackage.d3b1;
import defpackage.evu0;
import defpackage.g6u;
import defpackage.gjy0;
import defpackage.jln;
import defpackage.kjy0;
import defpackage.njy0;
import defpackage.ny61;
import defpackage.o400;
import defpackage.qnt0;
import defpackage.sjh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.udq0;
import defpackage.uk20;
import defpackage.uyj;
import defpackage.w9f;
import defpackage.xzv;
import defpackage.ycc;
import defpackage.zy11;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a implements uk20 {
    public final /* synthetic */ jln a;
    public final /* synthetic */ View b;
    public final /* synthetic */ GmsBankCardRecognitionActivity c;

    public a(jln jlnVar, View view, GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity) {
        this.a = jlnVar;
        this.b = view;
        this.c = gmsBankCardRecognitionActivity;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:0|1|(2:3|(26:5|6|(1:(1:(3:10|11|12)(2:14|15))(1:16))(1:199)|17|18|19|20|21|(2:22|(4:24|(1:26)|(3:28|29|30)(1:32)|31)(1:33))|34|(4:37|d5|42|35)|47|48|(2:51|49)|52|53|(13:56|(1:58)(1:120)|59|(4:62|(4:64|(4:66|(4:68|(2:72|(2:76|(2:78|(2:80|(2:82|(1:87)(2:84|85))))(2:88|89)))|90|91)|92|93)|94|95)(2:96|97)|86|60)|98|99|(4:102|(3:104|105|106)(1:108)|107|100)|109|110|(1:119)|(2:115|116)(1:118)|117|54)|121|122|(2:123|(5:125|(3:127|(3:(1:134)|135|136)|137)|140|141|(1:144)(1:143))(2:193|194))|145|(15:147|(2:150|148)|151|152|(2:155|153)|156|157|(5:160|(1:173)(1:164)|(3:166|167|168)(1:170)|169|158)|174|175|(5:177|(1:179)(1:190)|180|(1:182)(1:189)|183)(1:191)|184|(1:186)|11|12)|192|(0)|11|12))|201|6|(0)(0)|17|18|19|20|21|(3:22|(0)(0)|31)|34|(1:35)|47|48|(1:49)|52|53|(1:54)|121|122|(3:123|(0)(0)|143)|145|(0)|192|(0)|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x033f, code lost:
    
        if (r0 == r4) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0341, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x031b, code lost:
    
        defpackage.jst.e.n("Text recognition cancelled");
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0319, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x0323, code lost:
    
        defpackage.jst.e.p("Failed to recognize text", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x007b, code lost:
    
        if (r2 == r4) goto L165;
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0228 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0 A[EDGE_INSN: B:33:0x00c0->B:34:0x00c0 BREAK  A[LOOP:0: B:22:0x00a2->B:31:0x00a2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5 A[LOOP:2: B:49:0x00ef->B:51:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Image image, int i, ContinuationImpl continuationImpl) {
        GmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1 gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1;
        int i2;
        xzv c;
        w9f w9fVar;
        Object complete;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        Iterator it5;
        int i3;
        Object obj;
        String str;
        Pair pair;
        List W;
        AbstractList abstractList;
        int i4 = i;
        if (continuationImpl instanceof GmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1) {
            gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1 = (GmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1) continuationImpl;
            int i5 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label = i5 - Integer.MIN_VALUE;
                Object obj2 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label;
                int i6 = 1;
                if (i2 != 0) {
                    b.b(obj2);
                    c = xzv.c(image, i4, null);
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    GmsBankCardRecognitionActivity$onCreate$2$1$1$targetRect$1 gmsBankCardRecognitionActivity$onCreate$2$1$1$targetRect$1 = new GmsBankCardRecognitionActivity$onCreate$2$1$1$targetRect$1(this.b, null);
                    gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$0 = null;
                    gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$1 = c;
                    gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.I$0 = i4;
                    gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label = 1;
                    obj2 = tje.k0(g6uVar, gmsBankCardRecognitionActivity$onCreate$2$1$1$targetRect$1, gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1);
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj2);
                        return zy11.a;
                    }
                    i4 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.I$0;
                    c = (xzv) gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$1;
                    b.b(obj2);
                }
                Object obj3 = obj2;
                int i7 = i4;
                Rect rect = (Rect) obj3;
                List unmodifiableList = Collections.unmodifiableList(((njy0) udq0.f(((d3b1) this.a.b).c(c))).a);
                ArrayList arrayList = new ArrayList();
                it = unmodifiableList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    Rect rect2 = (Rect) ((kjy0) next).c;
                    if (rect2 != null ? rect2.intersect(rect) : false) {
                        arrayList.add(next);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    kjy0 kjy0Var = (kjy0) it2.next();
                    synchronized (kjy0Var) {
                        abstractList = kjy0Var.x;
                    }
                    ycc.r(abstractList, arrayList2);
                }
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(((gjy0) it3.next()).m());
                }
                ArrayList arrayList4 = new ArrayList();
                it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    String str2 = (String) it4.next();
                    List L0 = kotlin.collections.a.L0(str2.length() == 0 ? EmptyList.a : new qnt0(i6, str2));
                    ArrayList arrayList5 = new ArrayList(tcc.n(L0, 10));
                    Iterator it6 = L0.iterator();
                    while (it6.hasNext()) {
                        char charValue = ((Character) it6.next()).charValue();
                        int i8 = i6;
                        if (charValue != 'A') {
                            if (charValue != 'B') {
                                if (charValue != 'D') {
                                    if (charValue != 'I' && charValue != 'L') {
                                        if (charValue != 'O' && charValue != 'U') {
                                            if (charValue == 'b') {
                                                charValue = '6';
                                            } else if (charValue != 'i') {
                                                if (charValue != 'R') {
                                                    if (charValue == 'S') {
                                                        charValue = '5';
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    charValue = '1';
                                }
                                charValue = '0';
                            }
                            charValue = '8';
                        } else {
                            charValue = '4';
                        }
                        arrayList5.add(Character.valueOf(charValue));
                        i6 = i8;
                    }
                    int i9 = i6;
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it7 = arrayList5.iterator();
                    while (it7.hasNext()) {
                        Object next2 = it7.next();
                        if (Character.isDigit(((Character) next2).charValue())) {
                            arrayList6.add(next2);
                        }
                    }
                    String X = kotlin.collections.a.X(arrayList6, "", null, null, null, 62);
                    int length = X.length();
                    if (12 > length || length >= 20) {
                        X = null;
                    }
                    if (X != null) {
                        arrayList4.add(X);
                    }
                    i6 = i9;
                }
                it5 = arrayList4.iterator();
                while (true) {
                    int i10 = -1;
                    if (it5.hasNext()) {
                        i3 = -1;
                        obj = null;
                        break;
                    }
                    obj = it5.next();
                    String str3 = (String) obj;
                    int length2 = str3.length() - 1;
                    int i11 = 0;
                    boolean z = false;
                    while (i10 < length2) {
                        int i12 = i10;
                        int charAt = str3.charAt(length2) - '0';
                        if (charAt >= 0 && charAt <= 9) {
                            if (z && (charAt = charAt * 2) > 9) {
                                charAt -= 9;
                            }
                            i11 += charAt;
                            z = !z;
                        }
                        length2--;
                        i10 = i12;
                    }
                    i3 = i10;
                    if (i11 % 10 == 0) {
                        break;
                    }
                }
                str = (String) obj;
                if (str != null) {
                    Integer valueOf = Integer.valueOf(i3);
                    ArrayList arrayList7 = new ArrayList(tcc.n(arrayList2, 10));
                    Iterator it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        arrayList7.add(((gjy0) it8.next()).m());
                    }
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it9 = arrayList7.iterator();
                    while (it9.hasNext()) {
                        W = evu0.W((String) it9.next(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
                        ycc.r(W, arrayList8);
                    }
                    ArrayList arrayList9 = new ArrayList();
                    Iterator it10 = arrayList8.iterator();
                    while (it10.hasNext()) {
                        String str4 = (String) it10.next();
                        Pair pair2 = ((str4.length() == 5 || str4.length() == 7) && str4.charAt(2) == '/') ? new Pair(str4.substring(0, 2), str4.substring(3)) : null;
                        if (pair2 != null) {
                            arrayList9.add(pair2);
                        }
                    }
                    Pair pair3 = (Pair) kotlin.collections.a.R(arrayList9);
                    if (pair3 != null) {
                        Integer l = bvu0.l(10, (String) pair3.c());
                        Integer valueOf2 = Integer.valueOf(l != null ? l.intValue() : i3);
                        Integer l2 = bvu0.l(10, (String) pair3.f());
                        pair = new Pair(valueOf2, Integer.valueOf(l2 != null ? l2.intValue() : i3));
                    } else {
                        pair = new Pair(valueOf, valueOf);
                    }
                    w9fVar = new w9f(str, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                    if (w9fVar != null) {
                        GmsBankCardRecognitionActivity gmsBankCardRecognitionActivity = this.c;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$0 = null;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$1 = null;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$2 = null;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.L$3 = null;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.I$0 = i7;
                        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label = 2;
                        complete = gmsBankCardRecognitionActivity.complete(w9fVar, gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1);
                    }
                    return zy11.a;
                }
                w9fVar = null;
                if (w9fVar != null) {
                }
                return zy11.a;
            }
        }
        gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1 = new GmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1(this, continuationImpl);
        Object obj22 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = gmsBankCardRecognitionActivity$onCreate$2$1$1$handleCameraFrame$1.label;
        int i62 = 1;
        if (i2 != 0) {
        }
        Object obj32 = obj22;
        int i72 = i4;
        Rect rect3 = (Rect) obj32;
        List unmodifiableList2 = Collections.unmodifiableList(((njy0) udq0.f(((d3b1) this.a.b).c(c))).a);
        ArrayList arrayList10 = new ArrayList();
        it = unmodifiableList2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        ArrayList arrayList22 = new ArrayList();
        it2 = arrayList10.iterator();
        while (it2.hasNext()) {
        }
        ArrayList arrayList32 = new ArrayList(tcc.n(arrayList22, 10));
        it3 = arrayList22.iterator();
        while (it3.hasNext()) {
        }
        ArrayList arrayList42 = new ArrayList();
        it4 = arrayList32.iterator();
        while (it4.hasNext()) {
        }
        it5 = arrayList42.iterator();
        while (true) {
            int i102 = -1;
            if (it5.hasNext()) {
            }
        }
        str = (String) obj;
        if (str != null) {
        }
        w9fVar = null;
        if (w9fVar != null) {
        }
        return zy11.a;
    }
}
