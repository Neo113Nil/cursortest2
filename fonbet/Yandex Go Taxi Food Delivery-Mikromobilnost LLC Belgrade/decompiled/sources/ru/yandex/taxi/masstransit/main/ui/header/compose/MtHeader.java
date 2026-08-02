package ru.yandex.taxi.masstransit.main.ui.header.compose;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.compose.runtime.f;
import androidx.compose.ui.platform.ComposeView;
import defpackage.aii0;
import defpackage.bts;
import defpackage.co91;
import defpackage.cwa1;
import defpackage.did;
import defpackage.eyr;
import defpackage.fid;
import defpackage.ip11;
import defpackage.km30;
import defpackage.m020;
import defpackage.oz40;
import defpackage.p3z;
import defpackage.sc20;
import defpackage.sls;
import defpackage.sob1;
import defpackage.vng;
import defpackage.wls;
import defpackage.wwg;
import defpackage.yx40;
import defpackage.z4;
import defpackage.zmh;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\b\b\u0001\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\f2\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018R+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u000eR\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R+\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00118B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010\u0014R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/yandex/taxi/masstransit/main/ui/header/compose/MtHeader;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lip11;", "typefaceDelegate", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Lip11;Landroid/util/AttributeSet;)V", "Lkm30;", "uiState", "Lzy11;", "render", "(Lkm30;)V", "Content", "(Lfid;I)V", "", "padding", "statusBarPadding", "(I)V", "Lkotlin/Function0;", "callback", "onSubtitleClicked", "(Lsls;)V", "<set-?>", "uiState$delegate", "Loz40;", "getUiState", "()Lkm30;", "setUiState", "onSubtitleClickListener", "Lsls;", "statusBarPadding$delegate", "Lyx40;", "getStatusBarPadding", "()I", "setStatusBarPadding", "Leyr;", "logoFontFamily", "Leyr;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MtHeader extends FrameLayout {
    public static final int $stable = 8;
    private final eyr logoFontFamily;
    private sls onSubtitleClickListener;

    /* renamed from: statusBarPadding$delegate, reason: from kotlin metadata */
    private final yx40 statusBarPadding;

    /* renamed from: uiState$delegate, reason: from kotlin metadata */
    private final oz40 uiState;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.masstransit.main.ui.header.compose.MtHeader$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements wls {
        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj2).intValue();
            ((MtHeader) this.receiver).Content((fid) obj, intValue);
            return zy11.a;
        }
    }

    public MtHeader(Context context, ip11 ip11Var, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, this, MtHeader.class, "Content", "Content(Landroidx/compose/runtime/Composer;I)V", 0);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        co91.c(composeView, anonymousClass1);
        addView(composeView);
        this.uiState = f.j(new km30(null, "", "", ""));
        this.statusBarPadding = f.g(0);
        this.logoFontFamily = cwa1.a(((zmh) ip11Var).f(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$0(MtHeader mtHeader, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            km30 uiState = mtHeader.getUiState();
            int statusBarPadding = mtHeader.getStatusBarPadding();
            boolean e = btsVar.e(mtHeader);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new m020(25, mtHeader);
                btsVar.o0(Q);
            }
            km30 km30Var = km30.e;
            sob1.a(uiState, (sls) Q, statusBarPadding, btsVar, 8);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$0$0$0(MtHeader mtHeader) {
        sls slsVar = mtHeader.onSubtitleClickListener;
        if (slsVar != null) {
            slsVar.invoke();
        }
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 Content$lambda$1(MtHeader mtHeader, int i, fid fidVar, int i2) {
        mtHeader.Content(fidVar, vng.O(i | 1));
        return zy11.a;
    }

    private final int getStatusBarPadding() {
        return this.statusBarPadding.getIntValue();
    }

    private final km30 getUiState() {
        return (km30) this.uiState.getValue();
    }

    private final void setStatusBarPadding(int i) {
        this.statusBarPadding.setIntValue(i);
    }

    private final void setUiState(km30 km30Var) {
        this.uiState.setValue(km30Var);
    }

    public final void Content(fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(542519462);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            p3z.a(this.logoFontFamily, wwg.S(-911592968, true, new sc20(10, this), btsVar), btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(this, i, 24);
        }
    }

    public final void onSubtitleClicked(sls callback) {
        this.onSubtitleClickListener = callback;
    }

    public final void render(km30 uiState) {
        setUiState(uiState);
    }

    public final void statusBarPadding(int padding) {
        setStatusBarPadding(padding);
    }

    public MtHeader(Context context, ip11 ip11Var) {
        this(context, ip11Var, null, 4, null);
    }

    public /* synthetic */ MtHeader(Context context, ip11 ip11Var, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, ip11Var, (i & 4) != 0 ? null : attributeSet);
    }
}
