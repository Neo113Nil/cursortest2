package ru.yandex.taxi.altpins.confirmation_screen.fragment;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.altpins.models.OptionType;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class ConfirmAlternativeDestinationFragment$showModal$3 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((ConfirmAlternativeDestinationFragment) this.receiver).onConfirm((OptionType) obj);
        return zy11.a;
    }
}
