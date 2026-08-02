package ru.yandex.taxi.favorites.rides.settings_modal.ui;

import defpackage.aar0;
import defpackage.aip;
import defpackage.l9r0;
import defpackage.m9r0;
import defpackage.nqs0;
import defpackage.o9r0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalButtonName;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$RideSettingsModalCloseReason;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class SettingsModalView$adapter$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        nqs0 nqs0Var = (nqs0) obj;
        aar0 aar0Var = (aar0) this.receiver;
        aip aipVar = aar0Var.A;
        String str = aar0Var.B.a;
        if (nqs0Var instanceof l9r0) {
            aar0Var.C = FavoritesAnalytics$RideSettingsModalCloseReason.Delete;
            aipVar.b(str, FavoritesAnalytics$RideSettingsModalButtonName.Delete);
        } else if (nqs0Var instanceof m9r0) {
            aar0Var.C = FavoritesAnalytics$RideSettingsModalCloseReason.Edit;
            aipVar.b(str, FavoritesAnalytics$RideSettingsModalButtonName.Edit);
        } else if (nqs0Var instanceof o9r0) {
            aipVar.b(str, FavoritesAnalytics$RideSettingsModalButtonName.Share);
        }
        aar0Var.x.d(str, nqs0Var);
        return zy11.a;
    }
}
