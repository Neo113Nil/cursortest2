package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import kotlin.text.CatchingFishViewPagerDagger;

/* loaded from: classes.dex */
public final class FirebaseMessagingKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        return CatchingFishViewPagerDagger.CatchingFishReduxKtor;
    }
}
