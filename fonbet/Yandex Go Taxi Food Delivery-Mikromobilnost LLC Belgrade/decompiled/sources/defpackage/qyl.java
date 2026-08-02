package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import flex.feature.document.fragment.DocumentFragment;
import flex.feature.navigation.fragments.DocumentEngineFragment;
import java.util.Map;

/* loaded from: classes4.dex */
public final class qyl implements ejh {
    public final yvf0 a;

    public qyl(yvf0 yvf0Var) {
        this.a = yvf0Var;
    }

    @Override // defpackage.ejh
    public final Fragment a(u1m u1mVar, ywl ywlVar, Map map) {
        DocumentEngineFragment.Companion.getClass();
        DocumentEngineFragment documentEngineFragment = new DocumentEngineFragment();
        DocumentFragment.Companion.getClass();
        Bundle bundle = new Bundle(2);
        if (u1mVar != null) {
            bundle.putBundle("query", hk91.c(u1mVar));
        }
        if (ywlVar != null) {
            bundle.putString("document_label", h3m.b.b(ywlVar));
        }
        c9y.h(bundle, map);
        bundle.putString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY, lyl.b.b(this.a));
        documentEngineFragment.setArguments(bundle);
        return documentEngineFragment;
    }
}
