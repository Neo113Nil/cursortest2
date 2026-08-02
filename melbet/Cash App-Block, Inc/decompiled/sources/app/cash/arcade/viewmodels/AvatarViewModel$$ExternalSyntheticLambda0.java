package app.cash.arcade.viewmodels;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import app.cash.broadway.ui.compose.SpacesPagerInteractionManagerKt;
import com.squareup.cash.blockers.data.BlockersData;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class AvatarViewModel$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AvatarViewModel$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 7:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = SpacesPagerInteractionManagerKt.LocalSpacesPagerInteractionManager;
                break;
            case 8:
                StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = SpacesPagerInteractionManagerKt.LocalSpacesPagerInteractionManager;
                break;
            case 9:
                BlockersData.Flow.INSTANCE.getClass();
                break;
            case 19:
                EmptyMap emptyMap = EmptyMap.INSTANCE;
                emptyMap.getClass();
                break;
            case 20:
                EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                emptyMap2.getClass();
                break;
        }
        return Updater.mutableStateOf$default(Boolean.FALSE);
    }
}
