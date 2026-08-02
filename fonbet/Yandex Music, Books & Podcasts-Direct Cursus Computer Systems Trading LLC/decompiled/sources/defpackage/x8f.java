package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx8f;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class x8f extends x7f {
    public mqs l;
    public ve m;
    public zus n;
    public brs o;
    public p8f p;
    public z8f q;
    public final jyr r = l18.b.b(hag.I(dy7.class), true);

    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setPeekHeight(getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_expanded_top_margin) + getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_entity_peekheight));
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.o == null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onDestroyView() {
        super.onDestroyView();
        this.q = null;
        this.p = null;
    }

    @Override // androidx.fragment.app.o
    public final void onPause() {
        z8f z8fVar = this.q;
        if (z8fVar != null) {
            ((rjq) z8fVar.g).V();
            rar rarVar = (rar) z8fVar.f;
            if (rarVar != null) {
                rarVar.g(null);
            }
            ((rjq) z8fVar.h).V();
            pwl pwlVar = (pwl) z8fVar.o;
            mqs mqsVar = (mqs) z8fVar.j;
            pwlVar.getClass();
            mqsVar.getClass();
            nmb nmbVar = pwlVar.b;
            String G = pwlVar.a.G();
            String str = mqsVar.a;
            String str2 = mqsVar.c;
            k10 k10Var = mqsVar.d;
            tjb H = fgq.H(k10Var.d());
            String str3 = k10Var.a;
            String str4 = k10Var.d;
            nmbVar.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            G.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            linkedHashMap.put("track_name", str2);
            linkedHashMap.put("album_type", H.a);
            linkedHashMap.put("album_id", str3);
            linkedHashMap.put("album_name", str4);
            dfi.p(1, "hash", G, "_meta", linkedHashMap);
            nmbVar.C("TrackActions.Closed", linkedHashMap);
        }
        super.onPause();
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onResume() {
        super.onResume();
        z8f z8fVar = this.q;
        if (z8fVar != null) {
            dq7 dq7Var = ca8.a;
            Continuation continuation = null;
            z8fVar.f = x97.y(cmd.a, j5h.a, null, new s8f(z8fVar, continuation, 0), 2);
            ((rjq) z8fVar.h).g();
            um6 um6Var = (um6) z8fVar.l;
            x97.y(um6Var, null, null, new s8f(z8fVar, continuation, 2), 3);
            x97.y(um6Var, null, null, new s8f(z8fVar, continuation, 3), 3);
            pwl pwlVar = (pwl) z8fVar.o;
            String str = ((mqs) z8fVar.j).a;
            pwlVar.getClass();
            str.getClass();
            nmb nmbVar = pwlVar.b;
            nmbVar.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("page_type", "object");
            linkedHashMap.put("track_id", str);
            linkedHashMap.put("_meta", nmb.u(1));
            nmbVar.C("TrackActions.Opened", linkedHashMap);
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        z8f z8fVar;
        int i;
        super.onStart();
        p8f p8fVar = this.p;
        if (p8fVar != null && (z8fVar = this.q) != null) {
            z8fVar.e = p8fVar;
            mqs mqsVar = (mqs) z8fVar.a;
            Context context = (Context) z8fVar.i;
            mqsVar.getClass();
            long j = mqsVar.e;
            context.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mqsVar.c);
            String str = mqsVar.s;
            if (str != null) {
                spannableStringBuilder.append((CharSequence) " ");
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(weo.M(context, R.attr.textDisabled));
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) str);
                spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
            }
            jzb i2 = mqsVar.i();
            l18 l18Var = l18.b;
            bdt I = hag.I(byb.class);
            qdc qdcVar = l18Var.a;
            qdcVar.getClass();
            if (!((kob) ((byb) qdcVar.C(I)).b(kob.class)).h()) {
                int i3 = i2 == null ? -1 : nbb.b[i2.ordinal()];
                if (i3 != -1) {
                    if (i3 == 1) {
                        vq2.q(spannableStringBuilder, context);
                    } else if (i3 == 2) {
                        Drawable drawable = context.getDrawable(R.drawable.ic_explicit_age_16);
                        if (drawable != null) {
                            drawable.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_explicit_icon_size_18_width), context.getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_explicit_icon_size_18_height));
                            drawable.setTint(weo.M(context, android.R.attr.textColorPrimary));
                            spannableStringBuilder.append((CharSequence) "  ");
                            obb obbVar = new obb(drawable);
                            int length2 = spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) etn.J(context, R.string.explicit_element_content_description));
                            spannableStringBuilder.setSpan(obbVar, length2, spannableStringBuilder.length(), 17);
                        }
                    } else {
                        if (i3 != 3) {
                            b6e.s();
                            return;
                        }
                        vq2.q(spannableStringBuilder, context);
                    }
                }
            } else if (i2 != null) {
                int ordinal = i2.ordinal();
                if (ordinal == 0) {
                    i = R.drawable.ic_explicit_16;
                } else if (ordinal == 1) {
                    i = R.drawable.ic_explicit_age_16;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    i = R.drawable.ic_universal_marking_16;
                }
                Drawable drawable2 = context.getDrawable(i);
                if (drawable2 != null) {
                    drawable2.setBounds(0, 0, context.getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_explicit_icon_size_18_width), context.getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_explicit_icon_size_18_height));
                    drawable2.setTint(weo.M(context, android.R.attr.textColorPrimary));
                    spannableStringBuilder.append((CharSequence) "  ");
                    obb obbVar2 = new obb(drawable2);
                    int length3 = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) etn.J(context, R.string.explicit_element_content_description));
                    spannableStringBuilder.setSpan(obbVar2, length3, spannableStringBuilder.length(), 17);
                }
            }
            String B = ywf.B(fxf.W(mqsVar).toString(), hag.r(j), " • ");
            B.getClass();
            String B2 = ywf.B(fxf.W(mqsVar).toString(), saf.q0(j), " • ");
            B2.getClass();
            p8fVar.d = new jvd(spannableStringBuilder, B, mqsVar.x0, B2);
            p8fVar.c();
            p8fVar.f = mqsVar.z;
            p8fVar.c();
            ?? r2 = z8fVar.c;
            r2.getClass();
            p8fVar.e = r2;
            p8fVar.c();
        }
        p8f p8fVar2 = this.p;
        if (p8fVar2 != null) {
            p8fVar2.b().getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_entity_peekheight);
            p8fVar2.c();
        }
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        z8f z8fVar = this.q;
        if (z8fVar != null) {
            p8f p8fVar = (p8f) z8fVar.e;
            if (p8fVar != null) {
                p8fVar.b().clearAnimation();
            }
            z8fVar.e = null;
        }
        super.onStop();
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (this.l == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("Track must be set!!!!"), null, 2, null);
            dismissAllowingStateLoss();
            return;
        }
        if (this.m == null) {
            Assertions.throwOrSkip$default(new FailedAssertionException("ActionContext must be set!!!!"), null, 2, null);
            dismissAllowingStateLoss();
            return;
        }
        Context context = getContext();
        context.getClass();
        mqs mqsVar = this.l;
        if (mqsVar == null) {
            Intrinsics.j("track");
            throw null;
        }
        zus zusVar = this.n;
        if (zusVar == null) {
            Intrinsics.j("trackMeta");
            throw null;
        }
        brs brsVar = this.o;
        if (brsVar == null) {
            Intrinsics.j("actionManager");
            throw null;
        }
        fnb m = this.i.m();
        oxa oxaVar = new oxa(10, this);
        brs brsVar2 = this.o;
        if (brsVar2 == null) {
            Intrinsics.j("actionManager");
            throw null;
        }
        this.q = new z8f(context, mqsVar, zusVar, brsVar, m, oxaVar, brsVar2.l);
        LayoutInflater layoutInflater = getLayoutInflater();
        layoutInflater.getClass();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        this.p = new p8f(layoutInflater, (JuicyBottomSheetFrameLayout) findViewById, d(), new w8f(this, 0), new w8f(this, 1), this.j);
    }
}
