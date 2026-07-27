package com.google.firebase.firestore;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.text.CatchingFishToastKtor;
import kotlin.text.CatchingFishViewPagerDagger;

/* loaded from: classes.dex */
public final class FirebaseFirestoreKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<CatchingFishToastKtor> getComponents() {
        return CatchingFishViewPagerDagger.CatchingFishReduxKtor;
    }
}
