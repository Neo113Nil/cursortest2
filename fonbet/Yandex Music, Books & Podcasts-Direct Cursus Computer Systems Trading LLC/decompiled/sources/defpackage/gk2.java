package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class gk2 implements df {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gk2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.df
    public final void b(md mdVar, dn9 dn9Var) {
        int identifier;
        fic ficVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fk2 fk2Var = (fk2) mdVar;
                t3a i2 = ((c1t) obj).i();
                boolean z = !Intrinsics.d(fk2Var.a, Boolean.FALSE);
                uah.i(fk2Var.b, (Map) dn9Var.e);
                i2.a(z);
                break;
            case 1:
                r98 r98Var = (r98) mdVar;
                t3a i3 = ((c1t) obj).i();
                boolean z2 = !Intrinsics.d(r98Var.a, Boolean.FALSE);
                md mdVar2 = r98Var.b;
                uah.i(r98Var.c, (Map) dn9Var.e);
                y yVar = i3.a;
                if (mdVar2 != null) {
                    Iterator it = CollectionsKt.B0(yVar.c.f()).iterator();
                    Object obj2 = null;
                    while (true) {
                        ora oraVar = (ora) it;
                        if (oraVar.b.hasNext()) {
                            Object next = oraVar.next();
                            IndexedValue indexedValue = (IndexedValue) next;
                            int i4 = indexedValue.a;
                            o oVar = (o) indexedValue.b;
                            if (i4 != u75.g(yVar.c.f()) && (oVar instanceof we)) {
                                obj2 = next;
                            }
                        } else {
                            IndexedValue indexedValue2 = (IndexedValue) obj2;
                            o oVar2 = indexedValue2 != null ? (o) indexedValue2.b : null;
                            we weVar = oVar2 instanceof we ? (we) oVar2 : null;
                            if (weVar != null) {
                                weVar.c(mdVar2);
                            }
                        }
                    }
                }
                o oVar3 = (o) CollectionsKt.Z(yVar.c.f());
                if (!(oVar3 instanceof i)) {
                    i3.a(z2);
                    break;
                } else {
                    i iVar = (i) oVar3;
                    Dialog dialog = iVar.getDialog();
                    if (dialog instanceof ze3) {
                        ((ze3) dialog).j = z2;
                    }
                    iVar.dismiss();
                    yVar.c.f().isEmpty();
                    break;
                }
                break;
            case 2:
                msc mscVar = (msc) mdVar;
                t3a i5 = ((c1t) obj).i();
                t5a t5aVar = mscVar.a;
                q2a q2aVar = mscVar.b;
                boolean d = Intrinsics.d(mscVar.c, Boolean.FALSE);
                LinkedHashMap i6 = uah.i(mscVar.d, (Map) dn9Var.e);
                en9 en9Var = (en9) i5.c.b;
                s3a s3aVar = new s3a();
                Bundle bundle = new Bundle(2);
                if (t5aVar != null) {
                    bundle.putBundle("query", gld.W(t5aVar));
                }
                if (q2aVar != null) {
                    bundle.putString("document_label", n6a.b.C(q2aVar));
                }
                gld.Y(bundle, i6);
                bundle.putString("dependencies_label", q3a.b.C(en9Var));
                s3aVar.setArguments(bundle);
                y yVar2 = i5.a;
                a l = su4.l(yVar2, yVar2);
                if (!d) {
                    l.g(R.animator.slide_in_left, R.animator.slide_out_to_left, R.animator.slide_in_right, R.animator.slide_out_to_right);
                }
                l.d(i5.b, s3aVar, null, 1);
                Object obj3 = i6.get("flexNavigationBackstackTag");
                l.c(obj3 != null ? obj3.toString() : null);
                l.r = true;
                l.k(true, true);
                break;
            case 3:
                xxd xxdVar = (xxd) mdVar;
                t3a i7 = ((c1t) obj).i();
                String str = xxdVar.a;
                uah.i(xxdVar.b, (Map) dn9Var.e);
                fic ficVar2 = (fic) ((LinkedHashMap) i7.f.b).remove(str);
                if (ficVar2 != null) {
                    ficVar2.a(false);
                    break;
                }
                break;
            case 4:
                ezj ezjVar = (ezj) mdVar;
                t3a i8 = ((c1t) obj).i();
                t5a t5aVar2 = ezjVar.a;
                q2a q2aVar2 = ezjVar.b;
                boolean z3 = !Intrinsics.d(ezjVar.c, Boolean.FALSE);
                boolean d2 = Intrinsics.d(ezjVar.d, Boolean.TRUE);
                LinkedHashMap i9 = uah.i(ezjVar.e, (Map) dn9Var.e);
                en9 en9Var2 = (en9) i8.d.a;
                r3a r3aVar = new r3a();
                Bundle bundle2 = new Bundle(4);
                if (t5aVar2 != null) {
                    bundle2.putBundle("query", gld.W(t5aVar2));
                }
                if (q2aVar2 != null) {
                    bundle2.putString("document_label", n6a.b.C(q2aVar2));
                }
                bundle2.putBoolean("fullscreen", d2);
                bundle2.putBoolean("animated", z3);
                gld.Y(bundle2, i9);
                bundle2.putString("dependencies_label", q3a.b.C(en9Var2));
                r3aVar.setArguments(bundle2);
                y yVar3 = i8.a;
                a l2 = su4.l(yVar3, yVar3);
                Object obj4 = i9.get("flexNavigationBackstackTag");
                l2.c(obj4 != null ? obj4.toString() : null);
                l2.r = true;
                r3aVar.show(l2, (String) null);
                break;
            case 5:
                eeq eeqVar = (eeq) mdVar;
                t3a i10 = ((c1t) obj).i();
                String str2 = eeqVar.b;
                q2a q2aVar3 = eeqVar.a;
                uah.i(eeqVar.c, (Map) dn9Var.e);
                bnd bndVar = i10.f;
                vx6 vx6Var = i10.g;
                qne qneVar = new qne(i10, str2);
                gh7 gh7Var = (gh7) vx6Var.b;
                dzf dzfVar = (dzf) vx6Var.c;
                fic ficVar3 = new fic(gh7Var, dzfVar, qneVar, (t0a) vx6Var.d);
                LinkedHashMap linkedHashMap = (LinkedHashMap) bndVar.b;
                if (linkedHashMap.containsKey(str2) && (ficVar = (fic) linkedHashMap.get(str2)) != null) {
                    ficVar.a(true);
                }
                linkedHashMap.put(str2, ficVar3);
                ViewGroup b = gh7Var.b();
                o3a o3aVar = ficVar3.d;
                if (b != null) {
                    if (ficVar3.c == null) {
                        FrameLayout frameLayout = new FrameLayout(b.getContext());
                        frameLayout.setId(View.generateViewId());
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
                        Context context = b.getContext();
                        int identifier2 = context.getResources().getIdentifier("status_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM);
                        marginLayoutParams.topMargin = identifier2 > 0 ? context.getResources().getDimensionPixelSize(identifier2) : 0;
                        Context context2 = b.getContext();
                        marginLayoutParams.bottomMargin = (ViewConfiguration.get(context2).hasPermanentMenuKey() || (identifier = context2.getResources().getIdentifier("navigation_bar_height", "dimen", ConstantDeviceInfo.APP_PLATFORM)) <= 0) ? 0 : context2.getResources().getDimensionPixelSize(identifier);
                        b.addView(frameLayout, -1, marginLayoutParams);
                        ficVar3.c = frameLayout;
                    }
                    FrameLayout frameLayout2 = ficVar3.c;
                    if (frameLayout2 == null) {
                        xq0.x("Required value was null.");
                        break;
                    } else {
                        o3aVar.c(frameLayout2, dzfVar);
                    }
                }
                if (q2aVar3 != null) {
                    o3aVar.o(q2aVar3);
                    break;
                }
                break;
            case 6:
                heq heqVar = (heq) mdVar;
                t3a i11 = ((c1t) obj).i();
                t5a t5aVar3 = heqVar.a;
                q2a q2aVar4 = heqVar.b;
                boolean d3 = Intrinsics.d(heqVar.c, Boolean.TRUE);
                Boolean bool = heqVar.e;
                Boolean bool2 = Boolean.FALSE;
                boolean z4 = !Intrinsics.d(bool, bool2);
                boolean z5 = !Intrinsics.d(heqVar.d, bool2);
                boolean z6 = !Intrinsics.d(heqVar.f, bool2);
                Float f = heqVar.g;
                boolean z7 = !Intrinsics.d(heqVar.h, bool2);
                LinkedHashMap i12 = uah.i(heqVar.i, (Map) dn9Var.e);
                md mdVar3 = heqVar.j;
                en9 en9Var3 = (en9) i11.e.a;
                p3a p3aVar = new p3a();
                Bundle bundle3 = new Bundle(6);
                if (t5aVar3 != null) {
                    bundle3.putBundle("query", gld.W(t5aVar3));
                }
                if (q2aVar4 != null) {
                    bundle3.putString("document_label", n6a.b.C(q2aVar4));
                }
                bundle3.putBoolean("fullscreen", d3);
                bundle3.putBoolean("close_on_tap_outside", z4);
                bundle3.putBoolean("close_on_slide_down", z5);
                bundle3.putBoolean("dim_background", z6);
                if (f != null) {
                    bundle3.putFloat("default_height", f.floatValue());
                }
                bundle3.putBoolean("should_load_by_query", z7);
                gld.Y(bundle3, i12);
                bundle3.putString("dependencies_label", q3a.b.C(en9Var3));
                p3aVar.setArguments(bundle3);
                p3aVar.getLifecycle().a(new aq7(0, new aw5(14, mdVar3, i11)));
                y yVar4 = i11.a;
                a l3 = su4.l(yVar4, yVar4);
                Object obj5 = i12.get("flexNavigationBackstackTag");
                l3.c(obj5 != null ? obj5.toString() : null);
                l3.r = true;
                p3aVar.show(l3, (String) null);
                break;
            default:
                ev7 ev7Var = (ev7) mdVar;
                ev7Var.getClass();
                x97.y((tf6) obj, null, null, new bv6(ev7Var, dn9Var, null, 28), 3);
                break;
        }
    }
}
