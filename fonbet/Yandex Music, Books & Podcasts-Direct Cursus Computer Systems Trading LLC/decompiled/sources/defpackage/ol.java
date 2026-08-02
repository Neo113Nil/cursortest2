package defpackage;

import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.google.android.material.textfield.TextInputEditText;
import com.yandex.payment.divkit.bind.view.DKCvnInput;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import com.yandex.pulse.metrics.o;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.catalog.juicybottommenu.dialog.addtoplaylist.a;
import ru.yandex.music.entry.EntryScreenActivity;
import ru.yandex.music.settings.SettingsActivity;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final /* synthetic */ class ol implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ol(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r1v47, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Dialog dialog;
        r5 = null;
        Object[] objArr = null;
        switch (this.a) {
            case 0:
                ((pl) this.b).u.invoke();
                return;
            case 1:
                a aVar = (a) this.b;
                aVar.u.invoke(Integer.valueOf(aVar.c()));
                return;
            case 2:
                Function0 function0 = ((nl2) this.b).v;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 3:
                ChallengerInputView challengerInputView = (ChallengerInputView) this.b;
                int i = ChallengerInputView.k;
                challengerInputView.getClass();
                if (challengerInputView.a.a.getVisibility() == 0) {
                    return;
                }
                challengerInputView.b();
                return;
            case 4:
                dn4 dn4Var = (dn4) this.b;
                EditText editText = dn4Var.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                dn4Var.p();
                return;
            case 5:
                v13 v13Var = (v13) this.b;
                sv5 sv5Var = (sv5) v13Var.b;
                us5 us5Var = (us5) v13Var.c;
                if (sv5Var.c != null) {
                    String str = us5Var.n;
                    Assertions.assertNonEmpty(str);
                    if (y7g.G(str)) {
                        return;
                    }
                    dn9 dn9Var = sv5Var.a;
                    nmb nmbVar = (nmb) dn9Var.e;
                    String G = ((fnb) dn9Var.d).G();
                    String str2 = (String) dn9Var.c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = (String) dn9Var.f;
                    String str4 = (String) dn9Var.b;
                    clb[] clbVarArr = clb.a;
                    nmbVar.getClass();
                    G.getClass();
                    str3.getClass();
                    str4.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("page_id", "concert_screen");
                    linkedHashMap.put("page_type", "object");
                    linkedHashMap.put("hash", G);
                    linkedHashMap.put("artist_id", str2);
                    linkedHashMap.put("view_uuid", str3);
                    linkedHashMap.put("object_type", "concert");
                    linkedHashMap.put("object_id", str4);
                    linkedHashMap.put("from", "concert_screen");
                    dfi.p(1, "to", "concert_purchase_screen", "_meta", linkedHashMap);
                    nmbVar.C("Concert.Navigated", linkedHashMap);
                    if (str != null) {
                        ((ty5) sv5Var.c.b).s(us5Var.a, str);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ((hf7) ((g06) this.b).a).invoke();
                return;
            case 7:
                ((ty6) this.b).y().p.m(vy6.a);
                return;
            case 8:
                t17 t17Var = (t17) this.b;
                int i2 = t17.l;
                if (t17Var.a.a.getVisibility() == 0) {
                    return;
                }
                t17Var.b();
                return;
            case 9:
                DKCvnInput dKCvnInput = (DKCvnInput) this.b;
                int i3 = DKCvnInput.k;
                dKCvnInput.f.invoke(Integer.valueOf(dKCvnInput.j.d));
                return;
            case 10:
                u37 u37Var = (u37) this.b;
                int i4 = u37.b;
                ((TextInputEditText) u37Var.a.b).setText((CharSequence) null);
                return;
            case 11:
                r2f r2fVar = (r2f) ((xqn) this.b).a;
                if (r2fVar != null) {
                    r2fVar.g(null);
                    return;
                }
                return;
            case 12:
                f2a f2aVar = (f2a) this.b;
                int i5 = f2a.j;
                xdh xdhVar = f2aVar.a;
                vwb.W((EditText) xdhVar.d);
                if (f2aVar.f) {
                    Animation animation = ((View) xdhVar.b).getAnimation();
                    if (qdq.C(animation != null ? Boolean.valueOf(animation.hasEnded()) : null)) {
                        ez6 ez6Var = f2aVar.g;
                        boolean z = f2aVar.getVisibility() == 0;
                        pv8 pv8Var = (pv8) CollectionsKt.Z(ez6Var.c);
                        if (pv8Var != null) {
                            pv8Var.setState(new mv8(z));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                t2a t2aVar = (t2a) this.b;
                Dialog dialog2 = t2aVar.getDialog();
                if (dialog2 == null || !dialog2.isShowing() || (dialog = t2aVar.getDialog()) == null) {
                    return;
                }
                dialog.cancel();
                return;
            case 14:
                ((wra) this.b).t();
                return;
            case 15:
                xyb xybVar = (xyb) this.b;
                wt5 wt5Var = xybVar.l;
                if (wt5Var != null) {
                    tnb.d((tnb) wt5Var.a.getValue(), wjb.SettingsScreen);
                }
                xybVar.dismissAllowingStateLoss();
                cpp cppVar = SettingsActivity.v0;
                Context context = xybVar.getContext();
                context.getClass();
                lsp lspVar = lsp.h;
                cppVar.getClass();
                Intent a = cpp.a(context, lspVar);
                Context context2 = xybVar.getContext();
                a.putExtra("need_collapse", true);
                context2.startActivity(a);
                return;
            case 16:
                hzb hzbVar = (hzb) this.b;
                wt5 wt5Var2 = hzbVar.l;
                if (wt5Var2 != null) {
                    tnb.d((tnb) wt5Var2.a.getValue(), wjb.SettingsScreen);
                }
                hzbVar.dismissAllowingStateLoss();
                cpp cppVar2 = SettingsActivity.v0;
                Context context3 = hzbVar.getContext();
                context3.getClass();
                lsp lspVar2 = lsp.h;
                cppVar2.getClass();
                Intent a2 = cpp.a(context3, lspVar2);
                Context context4 = hzbVar.getContext();
                a2.putExtra("need_collapse", true);
                context4.startActivity(a2);
                return;
            case 17:
                ((izb) this.b).dismissAllowingStateLoss();
                return;
            case 18:
                h4b h4bVar = ((m0c) this.b).h;
                if (h4bVar != null) {
                    iz7 iz7Var = (iz7) h4bVar.a;
                    n7b n7bVar = (n7b) iz7Var.b;
                    if (n7bVar != null) {
                        ixc ixcVar = (ixc) iz7Var.d;
                        if (ixcVar == null) {
                            Intrinsics.j("data");
                            throw null;
                        }
                        ixc ixcVar2 = new ixc(ixcVar.a, ixcVar.b, ixcVar.c, ixcVar.d, ixcVar.e, null, null, null, null);
                        int i6 = FullInfoActivity.g;
                        FullInfoActivity fullInfoActivity = (FullInfoActivity) n7bVar.a;
                        Intent l0 = wdp.l0(fullInfoActivity, ixcVar2, true);
                        rxc rxcVar = fullInfoActivity.e;
                        rxcVar.getClass();
                        ImageView c = rxcVar.c();
                        rxc rxcVar2 = fullInfoActivity.e;
                        rxcVar2.getClass();
                        Pair[] pairArr = {Pair.create(c, "shared_cover"), Pair.create(rxcVar2.d(), "shared_cover_blurred")};
                        z4k[] z4kVarArr = new z4k[2];
                        for (int i7 = 0; i7 < 2; i7++) {
                            Pair pair = pairArr[i7];
                            z4kVarArr[i7] = new z4k((View) pair.first, (String) pair.second);
                        }
                        Pair[] pairArr2 = new Pair[2];
                        for (int i8 = 0; i8 < 2; i8++) {
                            z4k z4kVar = z4kVarArr[i8];
                            pairArr2[i8] = Pair.create((View) z4kVar.a, (String) z4kVar.b);
                        }
                        fullInfoActivity.startActivity(l0, ActivityOptions.makeSceneTransitionAnimation(fullInfoActivity, pairArr2).toBundle());
                        return;
                    }
                    return;
                }
                return;
            case 19:
                h4b h4bVar2 = ((rxc) this.b).h;
                if (h4bVar2 != null) {
                    ef3 ef3Var = ef3.b;
                    muo muoVar = muo.MY_PLAYLISTS;
                    ef3.g(ef3Var, muoVar, df3.PLAYLIST_BOTTOMSHEET, pe3.TAPPED);
                    iz7 iz7Var2 = (iz7) h4bVar2.a;
                    n7b n7bVar2 = (n7b) iz7Var2.b;
                    if (n7bVar2 != null) {
                        ixc ixcVar3 = (ixc) iz7Var2.d;
                        if (ixcVar3 == null) {
                            Intrinsics.j("data");
                            throw null;
                        }
                        tn6 tn6Var = ixcVar3.e;
                        boolean z2 = tn6Var != null ? tn6Var.c : false;
                        FullInfoActivity fullInfoActivity2 = (FullInfoActivity) n7bVar2.a;
                        int i9 = FullInfoActivity.g;
                        l18 l18Var = l18.b;
                        bdt I = hag.I(byb.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        if (!((of3) ((byb) qdcVar.C(I)).b(of3.class)).h()) {
                            mka mkaVar = new mka((Object) fullInfoActivity2);
                            k8f k8fVar = new k8f();
                            k8fVar.l = muoVar;
                            k8fVar.n = z2;
                            k8fVar.m = mkaVar;
                            y supportFragmentManager = fullInfoActivity2.getSupportFragmentManager();
                            supportFragmentManager.getClass();
                            x7f.B(k8fVar, supportFragmentManager, "CHANGE_COVER_DIALOG");
                            return;
                        }
                        iz7 iz7Var3 = fullInfoActivity2.d;
                        if (iz7Var3 == null) {
                            return;
                        }
                        qxp qxpVar = new qxp(new jzi(new xzi(iz7Var3)));
                        y supportFragmentManager2 = fullInfoActivity2.getSupportFragmentManager();
                        supportFragmentManager2.getClass();
                        pu0 t = pd.t(new qzm[0]);
                        sai saiVar = new sai(false);
                        cvo cvoVar = cvo.i;
                        fxf.Q(supportFragmentManager2, o6m.b(wjb.BottomsheetScreen, null, 6), saiVar, "CHANGE_COVER_BOTTOM_SHEET", t, null, new wn5(new w04(z2, saiVar, qxpVar), 987845363, true), 16);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                s2e s2eVar = (s2e) this.b;
                if (s2eVar.p.isDraggable()) {
                    s2eVar.j().post(new sr7(22, s2eVar));
                    return;
                }
                return;
            case 21:
                n7b n7bVar3 = (n7b) ((yfx) this.b).c;
                if (n7bVar3 != null) {
                    tge tgeVar = (tge) ((jyr) ((gs4) n7bVar3.a).a).getValue();
                    tgeVar.getClass();
                    ssg.a(4, null, "Completing the update", null);
                    tax taxVar = (tax) tgeVar.b.getValue();
                    ikx ikxVar = taxVar.a;
                    String packageName = taxVar.c.getPackageName();
                    hox hoxVar = ikxVar.a;
                    if (hoxVar != null) {
                        ikx.e.e("completeUpdate(%s)", packageName);
                        i8s i8sVar = new i8s();
                        hoxVar.a().post(new ogx(hoxVar, i8sVar, i8sVar, new ogx(ikxVar, i8sVar, i8sVar, packageName, 1), 2));
                        return;
                    } else {
                        yee yeeVar = ikx.e;
                        Object[] objArr2 = {-9};
                        yeeVar.getClass();
                        if (Log.isLoggable("PlayCore", 6)) {
                            Log.e("PlayCore", yee.f(yeeVar.a, "onError(%d)", objArr2));
                        }
                        ywf.v(new ooe(-9));
                        return;
                    }
                }
                return;
            case 22:
                ((d0g) this.b).dismissAllowingStateLoss();
                return;
            case 23:
                ((hdh) this.b).y();
                throw null;
            case 24:
                ((oph) this.b).dismiss();
                return;
            case 25:
                t l = ((o6j) this.b).l();
                np2 np2Var = l instanceof np2 ? (np2) l : null;
                if (np2Var != null) {
                    ndb ndbVar = new ndb(false);
                    Intent intent = new Intent(np2Var, (Class<?>) EntryScreenActivity.class);
                    intent.putExtra("entry_type", ndbVar);
                    np2Var.startActivity(intent);
                    return;
                }
                return;
            case 26:
                ((u7j) this.b).dismissAllowingStateLoss();
                return;
            case 27:
                j6e j6eVar = (j6e) this.b;
                t1f t1fVar = new t1f(view.getContext(), view);
                vx6 vx6Var = (vx6) j6eVar.b;
                if (vx6Var != null) {
                    e23 e23Var = (e23) vx6Var.b;
                    final gc8 gc8Var = e23Var.a;
                    final xzb xzbVar = e23Var.b;
                    hxh hxhVar = (hxh) t1fVar.b;
                    for (final zc8 zc8Var : (List) vx6Var.c) {
                        final int size = hxhVar.f.size();
                        rxh a3 = hxhVar.a(0, 0, 0, (CharSequence) zc8Var.c.a(xzbVar));
                        final pe8 pe8Var = (pe8) vx6Var.d;
                        a3.p = new MenuItem.OnMenuItemClickListener() { // from class: je8
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) {
                                tqn tqnVar = new tqn();
                                int i10 = size;
                                zc8 zc8Var2 = zc8Var;
                                pe8 pe8Var2 = pe8Var;
                                gc8 gc8Var2 = gc8.this;
                                gc8Var2.v(new tj0(i10, 1, zc8Var2, pe8Var2, gc8Var2, xzbVar, tqnVar));
                                return tqnVar.a;
                            }
                        };
                    }
                }
                ayh ayhVar = (ayh) t1fVar.d;
                if (ayhVar.b()) {
                    return;
                }
                if (ayhVar.e != null) {
                    ayhVar.d(0, 0, false, false);
                    return;
                } else {
                    xq0.q("MenuPopupHelper cannot be used without an anchor");
                    return;
                }
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                aak aakVar = (aak) this.b;
                EditText editText2 = aakVar.f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = aakVar.f;
                if (editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    objArr = 1;
                }
                EditText editText4 = aakVar.f;
                if (objArr != null) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    aakVar.f.setSelection(selectionEnd);
                }
                aakVar.p();
                return;
            default:
                nbl nblVar = (nbl) this.b;
                boolean z3 = nblVar.R0;
                boolean z4 = !z3;
                String str5 = nblVar.O0;
                Drawable drawable = nblVar.M0;
                String str6 = nblVar.N0;
                Drawable drawable2 = nblVar.L0;
                if (z3 == z4) {
                    return;
                }
                nblVar.R0 = z4;
                ImageView imageView = nblVar.x;
                if (imageView != null) {
                    if (z3) {
                        imageView.setImageDrawable(drawable);
                        imageView.setContentDescription(str5);
                    } else {
                        imageView.setImageDrawable(drawable2);
                        imageView.setContentDescription(str6);
                    }
                }
                ImageView imageView2 = nblVar.y;
                if (imageView2 != null) {
                    if (z3) {
                        imageView2.setImageDrawable(drawable);
                        imageView2.setContentDescription(str5);
                    } else {
                        imageView2.setImageDrawable(drawable2);
                        imageView2.setContentDescription(str6);
                    }
                }
                bbl bblVar = nblVar.Q0;
                if (bblVar != null) {
                    bblVar.c();
                    return;
                }
                return;
        }
    }
}
