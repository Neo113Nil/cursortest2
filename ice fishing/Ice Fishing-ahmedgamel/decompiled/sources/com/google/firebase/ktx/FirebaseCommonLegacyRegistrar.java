package com.google.firebase.ktx;

import S0.f;
import T3.b;
import Z2.d;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<b> getComponents() {
        return d.n(f.i("fire-core-ktx", "21.0.0"));
    }
}
