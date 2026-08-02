package defpackage;

import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import androidx.core.view.b;
import com.yandex.go.platform.js_api.a;
import defpackage.ntc;
import defpackage.tje;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes6.dex */
public abstract class uab1 {
    public static final void a(gax gaxVar, String str, iyw iywVar, String... strArr) {
        List W;
        W = evu0.W(str, new String[]{Extension.DOT_CHAR}, (r2 & 4) != 0 ? 0 : 2);
        b(gaxVar, W, iywVar, strArr);
    }

    public static final void b(gax gaxVar, List list, iyw iywVar, String[] strArr) {
        if (list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        if (list.size() == 1) {
            gaxVar.getChildren().put(str, new dax(str, gaxVar.d(), iywVar, strArr));
            return;
        }
        mbx mbxVar = (bax) gaxVar.getChildren().get(str);
        if (!(mbxVar instanceof gax)) {
            mbxVar = new a(str, gaxVar.d());
            gaxVar.getChildren().put(str, mbxVar);
        }
        b((gax) mbxVar, list.subList(1, list.size()), iywVar, strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final ListItemComponent listItemComponent, final ntc ntcVar, final CharSequence charSequence, boolean z) {
        Float f;
        final int i;
        Typeface typeface = ntcVar.a;
        float f2 = ntcVar.c;
        listItemComponent.setTitleTypeface(typeface);
        listItemComponent.setTitleLineSpacing(0.0f, ntcVar.d);
        int i2 = ntcVar.g;
        boolean z2 = true;
        int i3 = 2;
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 == 4) {
                    i3 = 1;
                }
            }
            listItemComponent.setTitleAlignment(i3);
            f = ntcVar.h;
            if (f != null) {
                listItemComponent.setTitleLetterSpacing(f.floatValue());
            }
            i = !z ? ntcVar.f : ntcVar.e;
            WeakHashMap weakHashMap = b.a;
            if (listItemComponent.isLaidOut() || listItemComponent.isLayoutRequested()) {
                listItemComponent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.communications.util.SetupAdaptiveBannerTitleKt$setupAdaptiveBannerTitle$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        boolean z3;
                        view.removeOnLayoutChangeListener(this);
                        ntc ntcVar2 = ntc.this;
                        float f3 = ntcVar2.c;
                        float f4 = ntcVar2.b;
                        while (true) {
                            if (f4 < ntc.this.c) {
                                f4 = f3;
                                z3 = false;
                                break;
                            }
                            ListItemComponent listItemComponent2 = listItemComponent;
                            listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), f4));
                            if (new StaticLayout(charSequence, listItemComponent.title().getPaint(), listItemComponent.title().getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i) {
                                z3 = true;
                                break;
                            }
                            f4 -= 1.0f;
                        }
                        if (!z3) {
                            f4 = ntc.this.c;
                        }
                        ListItemComponent listItemComponent3 = listItemComponent;
                        listItemComponent3.setTitleTextSizePx((int) tje.b0(listItemComponent3.getContext(), f4));
                        ListItemComponent listItemComponent4 = listItemComponent;
                        if (z3) {
                            listItemComponent4.setTitleMaxLines(i);
                        } else {
                            listItemComponent4.setTitleSingleLine(false);
                        }
                    }
                });
            }
            float f3 = ntcVar.b;
            while (true) {
                if (f3 < f2) {
                    f3 = f2;
                    z2 = false;
                    break;
                } else {
                    listItemComponent.setTitleTextSizePx((int) tje.b0(listItemComponent.getContext(), f3));
                    if (new StaticLayout(charSequence, listItemComponent.title().getPaint(), listItemComponent.title().getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i) {
                        break;
                    } else {
                        f3 -= 1.0f;
                    }
                }
            }
            if (z2) {
                f2 = f3;
            }
            listItemComponent.setTitleTextSizePx((int) tje.b0(listItemComponent.getContext(), f2));
            if (z2) {
                listItemComponent.setTitleMaxLines(i);
                return;
            } else {
                listItemComponent.setTitleSingleLine(false);
                return;
            }
        }
        i3 = 0;
        listItemComponent.setTitleAlignment(i3);
        f = ntcVar.h;
        if (f != null) {
        }
        if (!z) {
        }
        WeakHashMap weakHashMap2 = b.a;
        if (listItemComponent.isLaidOut()) {
        }
        listItemComponent.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: ru.yandex.taxi.communications.util.SetupAdaptiveBannerTitleKt$setupAdaptiveBannerTitle$$inlined$doOnLayout$1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                boolean z3;
                view.removeOnLayoutChangeListener(this);
                ntc ntcVar2 = ntc.this;
                float f32 = ntcVar2.c;
                float f4 = ntcVar2.b;
                while (true) {
                    if (f4 < ntc.this.c) {
                        f4 = f32;
                        z3 = false;
                        break;
                    }
                    ListItemComponent listItemComponent2 = listItemComponent;
                    listItemComponent2.setTitleTextSizePx((int) tje.b0(listItemComponent2.getContext(), f4));
                    if (new StaticLayout(charSequence, listItemComponent.title().getPaint(), listItemComponent.title().getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount() <= i) {
                        z3 = true;
                        break;
                    }
                    f4 -= 1.0f;
                }
                if (!z3) {
                    f4 = ntc.this.c;
                }
                ListItemComponent listItemComponent3 = listItemComponent;
                listItemComponent3.setTitleTextSizePx((int) tje.b0(listItemComponent3.getContext(), f4));
                ListItemComponent listItemComponent4 = listItemComponent;
                if (z3) {
                    listItemComponent4.setTitleMaxLines(i);
                } else {
                    listItemComponent4.setTitleSingleLine(false);
                }
            }
        });
    }

    public static final ArrayList d(ArrayList arrayList) {
        int max = Math.max(0, (arrayList.size() * 2) - 1);
        ArrayList arrayList2 = new ArrayList(max);
        for (int i = 0; i < max; i++) {
            arrayList2.add(i % 2 == 0 ? (xf6) arrayList.get(i / 2) : new wf6(giy.c));
        }
        return arrayList2;
    }
}
