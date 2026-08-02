package androidx.compose.foundation.text.contextmenu.provider;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.BufferedChannel;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;

/* loaded from: classes.dex */
public final class BasicTextContextMenuProvider implements TextContextMenuProvider {
    public final ComposableLambdaImpl contextMenuBlock;
    public final MutatorMutex mutatorMutex = new MutatorMutex();
    public final ParcelableSnapshotMutableState session$delegate = Updater.mutableStateOf$default(null);

    public final class SessionImpl implements TextContextMenuSession {
        public final BufferedChannel channel = PapaEvent.Channel$default(0, null, null, 7);
        public final TextContextMenuDataProvider dataProvider;

        public SessionImpl(TextContextMenuDataProvider textContextMenuDataProvider) {
            this.dataProvider = textContextMenuDataProvider;
        }

        @Override // androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession
        public final void close() {
            this.channel.mo1159trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    public BasicTextContextMenuProvider(ComposableLambdaImpl composableLambdaImpl) {
        this.contextMenuBlock = composableLambdaImpl;
    }

    public final void ContextMenu(final Function0 function0, Composer composer, final int i) {
        final Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(723898654);
        int i2 = (gapComposer.changed(this) ? 32 : 16) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            SessionImpl sessionImpl = (SessionImpl) this.session$delegate.getValue();
            if (sessionImpl == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new Function2(this, function0, i, i3) { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ BasicTextContextMenuProvider f$0;
                        public final /* synthetic */ Function0 f$1;

                        {
                            this.$r8$classId = i3;
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    this.f$0.ContextMenu(this.f$1, composer2, Updater.updateChangedFlags(7));
                                    break;
                                default:
                                    this.f$0.ContextMenu(this.f$1, composer2, Updater.updateChangedFlags(7));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            function02 = function0;
            this.contextMenuBlock.invoke(sessionImpl, sessionImpl.dataProvider, function02, gapComposer, Integer.valueOf(MLKEMEngine.KyberPolyBytes));
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new Function2(this, function02, i, i4) { // from class: androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ BasicTextContextMenuProvider f$0;
                public final /* synthetic */ Function0 f$1;

                {
                    this.$r8$classId = i4;
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            this.f$0.ContextMenu(this.f$1, composer2, Updater.updateChangedFlags(7));
                            break;
                        default:
                            this.f$0.ContextMenu(this.f$1, composer2, Updater.updateChangedFlags(7));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    @Override // androidx.compose.foundation.text.contextmenu.provider.TextContextMenuProvider
    public final Object showTextContextMenu(TextContextMenuDataProvider textContextMenuDataProvider, SuspendLambda suspendLambda) {
        Object mutate$default = MutatorMutex.mutate$default(this.mutatorMutex, new PagingDataPresenter$collectFrom$2(this, new SessionImpl(textContextMenuDataProvider), null, 5), suspendLambda);
        return mutate$default == CoroutineSingletons.COROUTINE_SUSPENDED ? mutate$default : Unit.INSTANCE;
    }
}
