package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.family.sectionprovider.ManagedAccountItemKt$$ExternalSyntheticLambda0;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class zzck {
    public static final void ManagedAccountItemUI(Icons icons, String str, String str2, Function0 function0, CellDefaultAccessory cellDefaultAccessory, Composer composer, int i) {
        Icons icons2;
        String str3;
        String str4;
        Function0 function02;
        CellDefaultAccessory cellDefaultAccessory2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(493390837);
        int i2 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(str2) ? 256 : 128) | (gapComposer.changedInstance(function0) ? 2048 : 1024) | (gapComposer.changed(cellDefaultAccessory) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            str4 = str2;
            cellDefaultAccessory2 = cellDefaultAccessory;
            str3 = str;
            function02 = function0;
            icons2 = icons;
            CustomizeUtils.TransparentCellTheme(Expect_jvmKt.rememberComposableLambda(-1819765677, new ManagedAccountItemKt$$ExternalSyntheticLambda0(str4, function0, cellDefaultAccessory, icons, str), gapComposer), gapComposer, 6);
        } else {
            icons2 = icons;
            str3 = str;
            str4 = str2;
            function02 = function0;
            cellDefaultAccessory2 = cellDefaultAccessory;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ManagedAccountItemKt$$ExternalSyntheticLambda0(icons2, str3, str4, function02, cellDefaultAccessory2, i);
        }
    }

    public static JSONArray toJsonArray(List list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageExtension messageExtension = (MessageExtension) it.next();
            messageExtension.getClass();
            JSONObject put = new JSONObject().put("name", messageExtension.name).put("id", messageExtension.id).put("criticalityIndicator", messageExtension.criticalityIndicator).put("data", new JSONObject(messageExtension.data));
            put.getClass();
            jSONArray.put(put);
        }
        return jSONArray;
    }

    public static int zza(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }
}
