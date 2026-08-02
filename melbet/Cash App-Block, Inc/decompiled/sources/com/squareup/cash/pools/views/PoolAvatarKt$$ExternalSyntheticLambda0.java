package com.squareup.cash.pools.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import coil3.RealImageLoader;
import coil3.compose.AsyncImagePainter;
import coil3.compose.RealSubcomposeAsyncImageScope;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSizeImpl;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.formview.components.arcade.ArcadeFormCellDefaultElementKt;
import com.squareup.cash.moneybot.genie.TextViewKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolAvatarKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ long f$3;

    public /* synthetic */ PoolAvatarKt$$ExternalSyntheticLambda0(CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage, String str, long j, RealImageLoader realImageLoader) {
        this.$r8$classId = 2;
        this.f$0 = cellDefaultAccessoryLeadingImage;
        this.f$1 = str;
        this.f$3 = j;
        this.f$2 = realImageLoader;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ImmutableList immutableList = (ImmutableList) obj6;
                Function3 function3 = (Function3) obj5;
                PoolAvatarSize poolAvatarSize = (PoolAvatarSize) obj4;
                BoxScope boxScope = (BoxScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                boxScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(boxScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    gapComposer.skipToGroupEnd();
                } else if (!immutableList.isEmpty() || function3 == null) {
                    gapComposer.startReplaceGroup(197860923);
                    VisibleKt.m3486ClusteredAvatarsww6aTOc(immutableList, poolAvatarSize.cluster, boxScope.align(companion, Alignment.Companion.Center), this.f$3, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(197813958);
                    function3.invoke(boxScope, gapComposer, Integer.valueOf(intValue & 14));
                    gapComposer.end(false);
                }
                return Unit.INSTANCE;
            case 1:
                AvatarImage.Remote remote = (AvatarImage.Remote) obj6;
                String str = (String) obj5;
                AvatarSizeImpl avatarSizeImpl = (AvatarSizeImpl) obj4;
                RealSubcomposeAsyncImageScope realSubcomposeAsyncImageScope = (RealSubcomposeAsyncImageScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                realSubcomposeAsyncImageScope.getClass();
                AsyncImagePainter asyncImagePainter = realSubcomposeAsyncImageScope.painter;
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(realSubcomposeAsyncImageScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    AsyncImagePainter.State state = (AsyncImagePainter.State) Updater.collectAsState(asyncImagePainter.state, null, gapComposer2, 1).getValue();
                    if ((state instanceof AsyncImagePainter.State.Loading) || (state instanceof AsyncImagePainter.State.Error) || (state instanceof AsyncImagePainter.State.Empty)) {
                        gapComposer2.startReplaceGroup(1107004648);
                        TextViewKt.m3621PlaceholderOrMonogramBx497Mc(remote.getPlaceholder$1(), str, avatarSizeImpl, this.f$3, gapComposer2, 0);
                        gapComposer2.end(false);
                    } else {
                        if (!(state instanceof AsyncImagePainter.State.Success)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1106999457, false);
                        }
                        gapComposer2.startReplaceGroup(-42469968);
                        ImageKt.Image(asyncImagePainter, null, SizeKt.fillMaxSize(companion, 1.0f), Alignment.Companion.Center, remote.getContentScale(), RecyclerView.DECELERATION_RATE, remote.colorFilter(gapComposer2), gapComposer2, 3504, 32);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                CellDefault.CellDefaultAccessoryLeadingImage cellDefaultAccessoryLeadingImage = (CellDefault.CellDefaultAccessoryLeadingImage) obj6;
                String str2 = (String) obj5;
                RealImageLoader realImageLoader = (RealImageLoader) obj4;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (cellDefaultAccessoryLeadingImage == null) {
                        gapComposer3.startReplaceGroup(-2143561692);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-2143561691);
                        ArcadeFormCellDefaultElementKt.AccessoryLeadingImage(cellDefaultAccessoryLeadingImage, realImageLoader, gapComposer3, 0);
                        ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        DefaultSizes.spacing.getClass();
                        SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 8.0f));
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$3, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PoolAvatarKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }
}
