package flex.feature.navigation.fragments;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import defpackage.iyl;
import defpackage.je4;
import defpackage.lyl;
import defpackage.yta1;
import defpackage.yvf0;
import flex.engine.a;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0003¨\u0006\u000b"}, d2 = {"Lflex/feature/navigation/fragments/DocumentEngineBottomSheetFragment;", "Lflex/feature/document/fragment/DocumentBottomSheetFragment;", "<init>", "()V", "Lflex/engine/a;", "createDocumentEngine", "()Lflex/engine/a;", "Lzy11;", "onDestroy", "Companion", "iyl", "flex-navigation-feature_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DocumentEngineBottomSheetFragment extends DocumentBottomSheetFragment {
    public static final iyl Companion = new iyl();

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment
    public a createDocumentEngine() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY) : null;
        yvf0 yvf0Var = string != null ? (yvf0) lyl.b.a.get(string) : null;
        if (yvf0Var != null) {
            return (a) yvf0Var.get();
        }
        return null;
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(je4 je4Var) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, defpackage.ucs
    public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
    }

    @Override // flex.feature.document.fragment.DocumentBottomSheetFragment, androidx.fragment.app.Fragment
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
