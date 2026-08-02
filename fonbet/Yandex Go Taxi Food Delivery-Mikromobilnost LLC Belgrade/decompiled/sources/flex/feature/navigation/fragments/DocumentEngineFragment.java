package flex.feature.navigation.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import defpackage.je4;
import defpackage.lyl;
import defpackage.pyl;
import defpackage.u1m;
import defpackage.yta1;
import defpackage.yvf0;
import flex.engine.a;
import flex.feature.document.fragment.DocumentFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003¨\u0006\u000f"}, d2 = {"Lflex/feature/navigation/fragments/DocumentEngineFragment;", "Lflex/feature/document/fragment/DocumentFragment;", "<init>", "()V", "Lu1m;", "query", "", "documentLabel", "Lflex/engine/a;", "createDocumentEngine", "(Lu1m;Ljava/lang/String;)Lflex/engine/a;", "Lzy11;", "onDestroy", "Companion", "pyl", "flex-navigation-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DocumentEngineFragment extends DocumentFragment {
    public static final pyl Companion = new pyl();

    @Override // flex.feature.document.fragment.DocumentFragment
    public a createDocumentEngine(u1m query, String documentLabel) {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY) : null;
        yvf0 yvf0Var = string != null ? (yvf0) lyl.b.a.get(string) : null;
        if (yvf0Var != null) {
            return (a) yvf0Var.get();
        }
        return null;
    }

    @Override // flex.feature.document.fragment.DocumentFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // flex.feature.document.fragment.DocumentFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    @Override // flex.feature.document.fragment.DocumentFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (yta1.b(this)) {
            Bundle arguments = getArguments();
            String string = arguments != null ? arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY) : null;
            if (string != null) {
                lyl.b.a(string);
            }
        }
    }
}
