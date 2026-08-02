package ru.yandex.taxi.search.address.view;

import defpackage.ny61;
import defpackage.yy4;
import ru.yandex.taxi.design.AddressInputComponent;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;

/* loaded from: classes6.dex */
public final class e implements Runnable {
    public final /* synthetic */ CompositeAddressSearchView a;
    public final /* synthetic */ boolean b;

    public e(CompositeAddressSearchView compositeAddressSearchView, boolean z) {
        this.a = compositeAddressSearchView;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PointType pointType;
        yy4 yy4Var;
        AddressInputComponent activeAddressInput;
        boolean z;
        yy4 yy4Var2;
        CompositeAddressSearchView.SourceDestinationType sourceDestinationType;
        ru.yandex.taxi.search.g gVar;
        ru.yandex.taxi.search.g gVar2;
        CompositeAddressSearchView compositeAddressSearchView = this.a;
        pointType = compositeAddressSearchView.activePoint;
        if (pointType == null) {
            ny61.g("Required value was null.");
            return;
        }
        yy4Var = compositeAddressSearchView.presenter;
        yy4Var.Lg(pointType);
        activeAddressInput = compositeAddressSearchView.activeAddressInput();
        compositeAddressSearchView.setActiveInputListeners(activeAddressInput);
        if (!activeAddressInput.hasFocus()) {
            gVar2 = compositeAddressSearchView.sourceDestinationHolder;
            if (!gVar2.c(pointType)) {
                z = false;
                if (this.b || z) {
                }
                yy4Var2 = compositeAddressSearchView.presenter;
                if (yy4Var2.Ug()) {
                    return;
                }
                sourceDestinationType = compositeAddressSearchView.sourceDestinationType;
                if (sourceDestinationType != CompositeAddressSearchView.SourceDestinationType.NEWBIES) {
                    activeAddressInput.requestFocus();
                    return;
                } else {
                    gVar = compositeAddressSearchView.sourceDestinationHolder;
                    gVar.d(pointType);
                    return;
                }
            }
        }
        z = true;
        if (this.b) {
        }
    }
}
