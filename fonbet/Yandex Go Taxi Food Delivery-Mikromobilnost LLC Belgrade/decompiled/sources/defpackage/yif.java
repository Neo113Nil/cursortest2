package defpackage;

import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.presentation.bottomsheet.CustomBottomSheetStorageKt;
import com.yandex.payment.sdk.flex.impl.fragment.CustomBottomSheetFragment;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import flex.feature.navigation.fragments.DocumentEngineBottomSheetFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class yif implements cjh {
    public final /* synthetic */ int a;
    public final tbl b;

    public /* synthetic */ yif(tbl tblVar, int i) {
        this.a = i;
        this.b = tblVar;
    }

    @Override // defpackage.cjh
    public final BottomSheetDialogFragment create(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map) {
        int i = this.a;
        tbl tblVar = this.b;
        switch (i) {
            case 0:
                CustomBottomSheetFragment.Companion.getClass();
                CustomBottomSheetFragment customBottomSheetFragment = new CustomBottomSheetFragment();
                DocumentBottomSheetFragment.Companion.getClass();
                Bundle a = cxl.a(u1mVar, ywlVar, z, z2, z3, z4, f, z5, map);
                LinkedHashMap linkedHashMap = myl.a;
                String uuid = UUID.randomUUID().toString();
                myl.a.put(uuid, tblVar);
                a.putString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY, uuid);
                customBottomSheetFragment.setArguments(a);
                return customBottomSheetFragment;
            default:
                DocumentEngineBottomSheetFragment.Companion.getClass();
                DocumentEngineBottomSheetFragment documentEngineBottomSheetFragment = new DocumentEngineBottomSheetFragment();
                DocumentBottomSheetFragment.Companion.getClass();
                Bundle a2 = cxl.a(u1mVar, ywlVar, z, z2, z3, z4, f, z5, map);
                a2.putString(CustomBottomSheetStorageKt.ENGINE_LABEL_KEY, lyl.b.b(tblVar));
                documentEngineBottomSheetFragment.setArguments(a2);
                return documentEngineBottomSheetFragment;
        }
    }
}
