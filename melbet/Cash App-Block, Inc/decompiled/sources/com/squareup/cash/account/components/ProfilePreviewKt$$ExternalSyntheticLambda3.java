package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.sheet.MenuPickerSheetKt$$ExternalSyntheticLambda4;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.deposits.physical.viewmodels.map.Limit;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.compose.StableHolder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ProfilePreviewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArrayList f$0;

    public /* synthetic */ ProfilePreviewKt$$ExternalSyntheticLambda3(int i, ArrayList arrayList) {
        this.$r8$classId = i;
        this.f$0 = arrayList;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Icons icons;
        int i = this.$r8$classId;
        ArrayList<PreviewTrustIndicator> arrayList = this.f$0;
        ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(listUnorderedScope) ? 4 : 2;
                }
                int i2 = intValue;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    for (PreviewTrustIndicator previewTrustIndicator : arrayList) {
                        String str = previewTrustIndicator.arcadeIconId;
                        ComposableLambdaImpl composableLambdaImpl = null;
                        if (str != null) {
                            Icons.Companion.getClass();
                            icons = zzd.get(str);
                        } else {
                            icons = null;
                        }
                        StableHolder stableHolder = previewTrustIndicator.icon;
                        Image image = stableHolder != null ? (Image) stableHolder.model : null;
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1982609987, new CartBannerViewKt$$ExternalSyntheticLambda2(previewTrustIndicator, 20), gapComposer);
                        if (icons != null) {
                            gapComposer.startReplaceGroup(-1515698748);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1180588931, new MenuPickerSheetKt$$ExternalSyntheticLambda4(15, icons, previewTrustIndicator), gapComposer);
                            gapComposer.end(false);
                        } else if (image != null) {
                            gapComposer.startReplaceGroup(-1515226277);
                            composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(2044212794, new ProfilePreviewKt$$ExternalSyntheticLambda9(image, 0), gapComposer);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1514887138);
                            gapComposer.end(false);
                        }
                        listUnorderedScope.ListUnorderedItem(rememberComposableLambda, (Modifier) null, composableLambdaImpl, (Function2) null, (Function2) null, gapComposer, ((i2 << 15) & 458752) | 6, 26);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(listUnorderedScope) ? 4 : 2;
                }
                int i3 = intValue2;
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Limit limit = (Limit) it.next();
                        listUnorderedScope.ListUnorderedItem(new AnnotatedString(limit.key), (Modifier) null, (Icons) null, new AnnotatedString(limit.value), (AnnotatedString) null, gapComposer2, (i3 << 15) & 458752, 22);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
