package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.catalog.info.FullInfoActivity;
import ru.yandex.music.catalog.juicybottommenu.JuicyBottomSheetFrameLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lk8f;", "Lx7f;", "<init>", "()V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class k8f extends x7f {
    public muo l;
    public mka m;
    public boolean n;

    @Override // defpackage.x7f
    public final void A(BottomSheetBehavior bottomSheetBehavior) {
        bottomSheetBehavior.getClass();
        bottomSheetBehavior.setSkipCollapsed(true);
        bottomSheetBehavior.setFitToContents(true);
        bottomSheetBehavior.setState(3);
    }

    @Override // defpackage.ue3, androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }

    @Override // defpackage.x7f, androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        muo muoVar = this.l;
        if (muoVar == null) {
            xq0.q("Screen should be initialized");
            return;
        }
        mka mkaVar = this.m;
        if (mkaVar == null) {
            xq0.q("Effect should be initialized");
            return;
        }
        boolean z = this.n;
        final g06 g06Var = new g06(muoVar, z, new qzc(6, this), mkaVar);
        LayoutInflater layoutInflater = getLayoutInflater();
        View findViewById = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById.getClass();
        final int i = 1;
        layoutInflater.inflate(R.layout.bottom_sheet_change_cover, (ViewGroup) findViewById, true);
        final int i2 = 0;
        final int i3 = 2;
        ArrayList j = u75.j(new pq(new xb5(new Function0() { // from class: j8f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                iz7 iz7Var;
                iz7 iz7Var2;
                iz7 iz7Var3;
                switch (i) {
                    case 0:
                        ef3 ef3Var = ef3.b;
                        g06 g06Var2 = g06Var;
                        ef3.g(ef3Var, (muo) g06Var2.a, (df3) g06Var2.d, pe3.CHOOSE_PHOTO);
                        ((k8f) ((qzc) g06Var2.b).b).dismissAllowingStateLoss();
                        mka mkaVar2 = (mka) g06Var2.c;
                        if (mkaVar2 != null && (iz7Var = ((FullInfoActivity) mkaVar2.a).d) != null) {
                            iz7Var.f();
                        }
                        break;
                    case 1:
                        ef3 ef3Var2 = ef3.b;
                        g06 g06Var3 = g06Var;
                        ef3.g(ef3Var2, (muo) g06Var3.a, (df3) g06Var3.d, pe3.TAKE_PHOTO);
                        ((k8f) ((qzc) g06Var3.b).b).dismissAllowingStateLoss();
                        mka mkaVar3 = (mka) g06Var3.c;
                        if (mkaVar3 != null && (iz7Var2 = ((FullInfoActivity) mkaVar3.a).d) != null) {
                            iz7Var2.o();
                        }
                        break;
                    default:
                        ef3 ef3Var3 = ef3.b;
                        g06 g06Var4 = g06Var;
                        ef3.g(ef3Var3, (muo) g06Var4.a, (df3) g06Var4.d, pe3.DELETE_COVER);
                        ((k8f) ((qzc) g06Var4.b).b).dismissAllowingStateLoss();
                        mka mkaVar4 = (mka) g06Var4.c;
                        if (mkaVar4 != null && (iz7Var3 = ((FullInfoActivity) mkaVar4.a).d) != null) {
                            iz7Var3.g();
                        }
                        break;
                }
                return Unit.a;
            }
        }, Integer.valueOf(R.drawable.ic_take_photo_24), R.string.playlist_upload_cover_take_picture, null, null, false, Integer.valueOf(R.string.playlist_upload_cover_take_picture), null, false, false, null, 1368), dh.n), new pq(new xb5(new Function0() { // from class: j8f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                iz7 iz7Var;
                iz7 iz7Var2;
                iz7 iz7Var3;
                switch (i2) {
                    case 0:
                        ef3 ef3Var = ef3.b;
                        g06 g06Var2 = g06Var;
                        ef3.g(ef3Var, (muo) g06Var2.a, (df3) g06Var2.d, pe3.CHOOSE_PHOTO);
                        ((k8f) ((qzc) g06Var2.b).b).dismissAllowingStateLoss();
                        mka mkaVar2 = (mka) g06Var2.c;
                        if (mkaVar2 != null && (iz7Var = ((FullInfoActivity) mkaVar2.a).d) != null) {
                            iz7Var.f();
                        }
                        break;
                    case 1:
                        ef3 ef3Var2 = ef3.b;
                        g06 g06Var3 = g06Var;
                        ef3.g(ef3Var2, (muo) g06Var3.a, (df3) g06Var3.d, pe3.TAKE_PHOTO);
                        ((k8f) ((qzc) g06Var3.b).b).dismissAllowingStateLoss();
                        mka mkaVar3 = (mka) g06Var3.c;
                        if (mkaVar3 != null && (iz7Var2 = ((FullInfoActivity) mkaVar3.a).d) != null) {
                            iz7Var2.o();
                        }
                        break;
                    default:
                        ef3 ef3Var3 = ef3.b;
                        g06 g06Var4 = g06Var;
                        ef3.g(ef3Var3, (muo) g06Var4.a, (df3) g06Var4.d, pe3.DELETE_COVER);
                        ((k8f) ((qzc) g06Var4.b).b).dismissAllowingStateLoss();
                        mka mkaVar4 = (mka) g06Var4.c;
                        if (mkaVar4 != null && (iz7Var3 = ((FullInfoActivity) mkaVar4.a).d) != null) {
                            iz7Var3.g();
                        }
                        break;
                }
                return Unit.a;
            }
        }, Integer.valueOf(R.drawable.ic_photo_album_24), R.string.playlist_upload_cover_choose_picture, null, null, false, Integer.valueOf(R.string.playlist_upload_cover_choose_picture), null, false, false, null, 1368), dh.o));
        if (z) {
            j.add(new pq(new xb5(new Function0() { // from class: j8f
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    iz7 iz7Var;
                    iz7 iz7Var2;
                    iz7 iz7Var3;
                    switch (i3) {
                        case 0:
                            ef3 ef3Var = ef3.b;
                            g06 g06Var2 = g06Var;
                            ef3.g(ef3Var, (muo) g06Var2.a, (df3) g06Var2.d, pe3.CHOOSE_PHOTO);
                            ((k8f) ((qzc) g06Var2.b).b).dismissAllowingStateLoss();
                            mka mkaVar2 = (mka) g06Var2.c;
                            if (mkaVar2 != null && (iz7Var = ((FullInfoActivity) mkaVar2.a).d) != null) {
                                iz7Var.f();
                            }
                            break;
                        case 1:
                            ef3 ef3Var2 = ef3.b;
                            g06 g06Var3 = g06Var;
                            ef3.g(ef3Var2, (muo) g06Var3.a, (df3) g06Var3.d, pe3.TAKE_PHOTO);
                            ((k8f) ((qzc) g06Var3.b).b).dismissAllowingStateLoss();
                            mka mkaVar3 = (mka) g06Var3.c;
                            if (mkaVar3 != null && (iz7Var2 = ((FullInfoActivity) mkaVar3.a).d) != null) {
                                iz7Var2.o();
                            }
                            break;
                        default:
                            ef3 ef3Var3 = ef3.b;
                            g06 g06Var4 = g06Var;
                            ef3.g(ef3Var3, (muo) g06Var4.a, (df3) g06Var4.d, pe3.DELETE_COVER);
                            ((k8f) ((qzc) g06Var4.b).b).dismissAllowingStateLoss();
                            mka mkaVar4 = (mka) g06Var4.c;
                            if (mkaVar4 != null && (iz7Var3 = ((FullInfoActivity) mkaVar4.a).d) != null) {
                                iz7Var3.g();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, Integer.valueOf(R.drawable.ic_trash_24), R.string.playlist_upload_cover_delete_cover, null, null, false, Integer.valueOf(R.string.playlist_upload_cover_delete_cover), null, false, false, null, 1368), dh.p));
        }
        m8f m8fVar = new m8f(0);
        View findViewById2 = requireView().findViewById(R.id.dialog_juicy_catalog_menu_container);
        findViewById2.getClass();
        RecyclerView recyclerView = (RecyclerView) ((JuicyBottomSheetFrameLayout) findViewById2).findViewById(R.id.changeCoverRecyclerView);
        recyclerView.setAdapter(m8fVar);
        float dimension = recyclerView.getContext().getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_large_plus_padding) + recyclerView.getResources().getDimension(R.dimen.juicy_bottom_sheet_anchor_top_margin);
        float dimension2 = recyclerView.getContext().getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_small_padding);
        float dimension3 = recyclerView.getContext().getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_large_plus_padding);
        float dimension4 = recyclerView.getContext().getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_corner_radius);
        Context context = recyclerView.getContext();
        context.getClass();
        recyclerView.s(new g8f(dimension, dimension3, dimension4, dimension2, weo.M(context, R.attr.bgPlaceholder)));
        ArrayList arrayList = new ArrayList();
        eh ehVar = new eh();
        arrayList.addAll(j);
        m8fVar.v(CollectionsKt.o0(arrayList, ehVar));
    }
}
