package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.yandex.messaging.extension.view.ViewExtensionsKt$requestApplyInsetsWhenAttached$1;
import com.yandex.messaging.input.util.Keyboarder$KeyboardState;
import com.yandex.messaging.input.util.c;
import com.yandex.messaging.internal.view.chat.ChatInputHeightState;
import com.yandex.messaging.miniapps.size.PredefinedSizeValue;
import com.yandex.messaging.miniapps.view.a;
import defpackage.eja1;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes15.dex */
public final class qh20 implements nh20 {
    public final hbz0 a;
    public final x22 b;
    public final ChatInputHeightState c;
    public final c d;
    public final com.yandex.bricks.c e;
    public final oh20 f;
    public a g;
    public final pzf h;
    public final wh20 i;
    public final Resources j;
    public int k;
    public int l;
    public hdb1 m;

    public qh20(hbz0 hbz0Var, r8g r8gVar, kse kseVar, x22 x22Var, ChatInputHeightState chatInputHeightState, c cVar) {
        this.a = hbz0Var;
        this.b = x22Var;
        this.c = chatInputHeightState;
        this.d = cVar;
        this.e = hbz0Var.R;
        oh20 oh20Var = new oh20(kseVar.a.plus(jl40.a()));
        this.f = oh20Var;
        String uuid = UUID.randomUUID().toString();
        String language = Locale.getDefault().getLanguage();
        int i = olh0.msg_b_miniapp_embedded;
        Context context = hbz0Var.getRoot().getContext();
        int i2 = kng0.messagingIsLightTheme;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        r8gVar.e = new lh20(true, i, uuid, language, !(typedValue.data != 0));
        r8gVar.f = this;
        r8gVar.g = oh20Var;
        pzf a = r8gVar.a();
        this.h = a;
        this.i = (wh20) ((xvf0) a.c).get();
        this.j = hbz0Var.getRoot().getResources();
    }

    @Override // defpackage.nh20
    public final void a(int i) {
        this.m = null;
        this.k = i;
        e();
    }

    @Override // defpackage.nh20
    public final void b() {
        dismiss();
    }

    @Override // defpackage.nh20
    public final void c(String str) {
        boolean z;
        boolean z2;
        c cVar = this.d;
        if (cVar.b == Keyboarder$KeyboardState.OPEN) {
            zq60 zq60Var = cVar.e;
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z2 = true;
                z = false;
            } else {
                zq60.a(zq60Var);
                z = true;
                z2 = false;
            }
            if (z2) {
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i < size) {
                    arrayList.get(i).getClass();
                    ny61.u();
                    return;
                } else {
                    if (!z) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                }
            }
            EditText editText = cVar.c;
            if (editText == null) {
                z83.j("mTextInput is null");
            } else {
                editText.clearFocus();
                cVar.a.hideSoftInputFromWindow(cVar.c.getWindowToken(), 0);
            }
        }
        cVar.h = true;
        a aVar = this.g;
        wh20 wh20Var = this.i;
        x22 x22Var = this.b;
        if (aVar != null) {
            x22Var.reportEvent("csat_error_already_shown", b.i(new Pair("currentUrl", wh20Var.c), new Pair("newUrl", str)));
            return;
        }
        x22Var.reportEvent("csat_show", gw00.e(new Pair("url", str)));
        wh20Var.c = null;
        wh20Var.b = str;
        String a = wh20Var.a();
        if (a == null) {
            ny61.r("miniappUrl wasn't built");
            return;
        }
        final a aVar2 = (a) ((nt0) this.h.m).get();
        com.yandex.bricks.c cVar2 = this.e;
        cVar2.a(aVar2);
        View view = cVar2.a;
        final sc20 sc20Var = new sc20(2, this);
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: tq31
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                return (WindowInsets) sc20.this.invoke(view2, windowInsets);
            }
        });
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new ViewExtensionsKt$requestApplyInsetsWhenAttached$1());
        }
        aVar2.q(a);
        this.a.getRoot().addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.messaging.ui.timeline.MiniAppEmbedded$show$$inlined$onLayoutChange$1
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                eja1.s(com.yandex.messaging.miniapps.view.a.this).b(new MiniAppEmbedded$show$2$1(this, null));
            }
        });
        this.g = aVar2;
    }

    @Override // defpackage.nh20
    public final void d(jjs0 jjs0Var) {
        hdb1 hdb1Var = jjs0Var.a;
        if (hdb1Var instanceof sjs0) {
            this.m = hdb1Var;
            this.k = m810.b(((sjs0) hdb1Var).a * kjs0.a.density);
        } else if (!(hdb1Var instanceof tjs0)) {
            if (hdb1Var == null) {
                return;
            }
            w511.b();
            return;
        } else if (((tjs0) hdb1Var).a == PredefinedSizeValue.MatchSafeViewportArea) {
            this.m = hdb1Var;
            this.k = (int) (this.j.getDisplayMetrics().heightPixels * 0.6d);
        }
        e();
    }

    @Override // defpackage.nh20
    public final void dismiss() {
        a aVar = this.g;
        if (aVar != null) {
            aVar.C.setVisibility(8);
            aVar.D.destroy();
        }
        this.g = null;
        this.l = 0;
        this.k = 0;
        this.m = null;
        int dimensionPixelSize = this.j.getDimensionPixelSize(gvg0.chat_input_height);
        com.yandex.bricks.c cVar = this.e;
        ViewGroup.LayoutParams layoutParams = cVar.a.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = dimensionPixelSize;
        }
        this.c.c(ChatInputHeightState.HeightConsumer.Miniapp);
        cVar.a(new nst(0, this.a.a));
        kotlinx.coroutines.a.g(this.f.a, null);
        this.d.h = false;
    }

    public final void e() {
        int i = this.k;
        if (i <= 0) {
            return;
        }
        View view = this.e.a;
        if (!(this.m instanceof tjs0)) {
            hbz0 hbz0Var = this.a;
            int height = hbz0Var.getRoot().getHeight() - hbz0Var.x.getHeight();
            i = Math.min(((int) ((height + r0) * 0.9d)) - this.l, this.k);
        }
        if (i != view.getHeight()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) layoutParams).gravity = 80;
            } else if (layoutParams instanceof LinearLayout.LayoutParams) {
                ((LinearLayout.LayoutParams) layoutParams).gravity = 80;
            }
            view.getLayoutParams().height = i;
            view.requestLayout();
        }
        ChatInputHeightState.HeightConsumer heightConsumer = ChatInputHeightState.HeightConsumer.Miniapp;
        Integer valueOf = Integer.valueOf(i);
        ChatInputHeightState chatInputHeightState = this.c;
        chatInputHeightState.a.put(heightConsumer, valueOf);
        chatInputHeightState.b();
    }

    @Override // defpackage.nh20
    public final boolean isShowing() {
        return this.g != null;
    }
}
