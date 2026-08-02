package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yandex.urbanads.internal.flex.UrbanAdsTheme;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import flex.feature.document.fragment.DocumentBottomSheetFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class xe21 implements cjh {
    public final tbl a;
    public final xf21 b;
    public final Context c;

    public xe21(tbl tblVar, xf21 xf21Var, Context context) {
        this.a = tblVar;
        this.b = xf21Var;
        this.c = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 == null) goto L9;
     */
    @Override // defpackage.cjh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final BottomSheetDialogFragment create(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, Map map) {
        String themeId;
        ve21 ve21Var = UrbanAdsBottomSheetFragment.Companion;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        xf21 xf21Var = this.b;
        String str = null;
        if (xf21Var != null) {
            themeId = xf21Var.a;
            if (themeId.length() <= 0) {
                themeId = null;
            }
        }
        int i = this.c.getResources().getConfiguration().uiMode & 48;
        if (i == 16) {
            str = UrbanAdsTheme.LIGHT.getThemeId();
        } else if (i == 32) {
            str = UrbanAdsTheme.DARK.getThemeId();
        }
        themeId = str == null ? UrbanAdsTheme.LIGHT.getThemeId() : str;
        linkedHashMap.put(UrbanAdsBottomSheetFragment.THEME_ID, themeId);
        ve21Var.getClass();
        UrbanAdsBottomSheetFragment urbanAdsBottomSheetFragment = new UrbanAdsBottomSheetFragment();
        DocumentBottomSheetFragment.Companion.getClass();
        Bundle a = cxl.a(u1mVar, ywlVar, z, z2, z3, true, f, z5, linkedHashMap);
        LinkedHashMap linkedHashMap2 = hf21.a;
        String uuid = UUID.randomUUID().toString();
        hf21.a.put(uuid, this.a);
        a.putString("urbanads_engine_label", uuid);
        urbanAdsBottomSheetFragment.setArguments(a);
        return urbanAdsBottomSheetFragment;
    }
}
