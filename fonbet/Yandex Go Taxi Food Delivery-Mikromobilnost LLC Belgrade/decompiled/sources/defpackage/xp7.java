package defpackage;

import android.graphics.Rect;
import android.media.Image;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.core.camerascanner.CardScanData;
import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes2.dex */
public final /* synthetic */ class xp7 implements t7v {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xp7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.t7v
    public final void d(x4r0 x4r0Var) {
        gn8 gn8Var;
        ArrayList arrayList;
        Iterator it;
        Object obj;
        Pair pair;
        List W;
        AbstractList abstractList;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                hq7 hq7Var = (hq7) obj2;
                Image f = x4r0Var.b.f();
                if (f != null) {
                    md6 md6Var = hq7Var.c;
                    CardScanData cardScanData = null;
                    xzv c = xzv.c(f, x4r0Var.x.e(), null);
                    sr4 sr4Var = (sr4) md6Var.b;
                    CardScannerActivity cardScannerActivity = (CardScannerActivity) md6Var.c;
                    gn8Var = cardScannerActivity.viewBinding;
                    if (gn8Var == null) {
                        gn8Var = null;
                    }
                    Rect targetRect = gn8Var.c.getTargetRect();
                    try {
                        List unmodifiableList = Collections.unmodifiableList(((njy0) udq0.f(((d3b1) sr4Var.b).c(c))).a);
                        arrayList = new ArrayList();
                        it = unmodifiableList.iterator();
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            Rect rect = (Rect) ((kjy0) next).c;
                            if (rect != null ? rect.intersect(targetRect) : false) {
                                arrayList.add(next);
                            }
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                kjy0 kjy0Var = (kjy0) it2.next();
                                synchronized (kjy0Var) {
                                    abstractList = kjy0Var.x;
                                }
                                ycc.r(abstractList, arrayList2);
                            }
                            ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, 10));
                            Iterator it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(((gjy0) it3.next()).m());
                            }
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = arrayList3.iterator();
                            while (it4.hasNext()) {
                                String str = (String) it4.next();
                                List L0 = a.L0(str.length() == 0 ? EmptyList.a : new qnt0(1, str));
                                ArrayList arrayList5 = new ArrayList(tcc.n(L0, 10));
                                Iterator it5 = L0.iterator();
                                while (it5.hasNext()) {
                                    char charValue = ((Character) it5.next()).charValue();
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
                                            charValue = MoneyInputEditView.DEFAULT_VALUE;
                                        }
                                        charValue = '8';
                                    } else {
                                        charValue = '4';
                                    }
                                    arrayList5.add(Character.valueOf(charValue));
                                }
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it6 = arrayList5.iterator();
                                while (it6.hasNext()) {
                                    Object next2 = it6.next();
                                    if (Character.isDigit(((Character) next2).charValue())) {
                                        arrayList6.add(next2);
                                    }
                                }
                                String X = a.X(arrayList6, "", null, null, null, 62);
                                int length = X.length();
                                if (12 > length || length >= 20) {
                                    X = null;
                                }
                                if (X != null) {
                                    arrayList4.add(X);
                                }
                            }
                            Iterator it7 = arrayList4.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    obj = it7.next();
                                    String str2 = (String) obj;
                                    pk8 pk8Var = new pk8(str2);
                                    ArrayList arrayList7 = rp8.f;
                                    rp8 s = q501.s(str2);
                                    qjd qjdVar = new qjd();
                                    qjdVar.c(new l8h());
                                    qjdVar.c(new wzz());
                                    qjdVar.c(new kby(q501.r(s.a, false).c));
                                    if (qjdVar.b(pk8Var) == null) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            String str3 = (String) obj;
                            if (str3 != null) {
                                ArrayList arrayList8 = new ArrayList(tcc.n(arrayList2, 10));
                                Iterator it8 = arrayList2.iterator();
                                while (it8.hasNext()) {
                                    arrayList8.add(((gjy0) it8.next()).m());
                                }
                                ArrayList arrayList9 = new ArrayList();
                                Iterator it9 = arrayList8.iterator();
                                while (it9.hasNext()) {
                                    W = evu0.W((String) it9.next(), new String[]{" "}, (r2 & 4) != 0 ? 0 : 2);
                                    ycc.r(W, arrayList9);
                                }
                                ArrayList arrayList10 = new ArrayList();
                                Iterator it10 = arrayList9.iterator();
                                while (it10.hasNext()) {
                                    String str4 = (String) it10.next();
                                    Pair pair2 = ((str4.length() == 5 || str4.length() == 7) && str4.charAt(2) == '/') ? new Pair(str4.substring(0, 2), str4.substring(3)) : null;
                                    if (pair2 != null) {
                                        arrayList10.add(pair2);
                                    }
                                }
                                Pair pair3 = (Pair) a.R(arrayList10);
                                if (pair3 != null) {
                                    Integer l = bvu0.l(10, (String) pair3.c());
                                    Integer valueOf = Integer.valueOf(l != null ? l.intValue() : -1);
                                    Integer l2 = bvu0.l(10, (String) pair3.f());
                                    pair = new Pair(valueOf, Integer.valueOf(l2 != null ? l2.intValue() : -1));
                                } else {
                                    pair = new Pair(-1, -1);
                                }
                                cardScanData = new CardScanData(str3, ((Number) pair.getFirst()).intValue(), ((Number) pair.getSecond()).intValue());
                            }
                            if (cardScanData != null) {
                                cardScannerActivity.runOnUiThread(new nm7(22, cardScannerActivity, cardScanData));
                            }
                        }
                    }
                }
                x4r0Var.close();
                return;
            default:
                ((t7v) obj2).d(x4r0Var);
                return;
        }
    }
}
