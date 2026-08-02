package com.squareup.cash.moneybot.presenters.plugins;

import app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.Brief;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlottedCard;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.TextCard;
import com.squareup.cash.moneybot.components.api.PluginContext;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class BriefPresenter implements MoleculeCallbackPresenter {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object metadata;
    public final Function2 onMessage;

    public BriefPresenter(Brief brief, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.metadata = brief;
        this.onMessage = function2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel, still in use, count: 3, list:
          (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) from 0x013b: MOVE (r24v1 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) = (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel)
          (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) from 0x00f4: MOVE (r24v3 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) = (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel)
          (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) from 0x0077: PHI (r4v4 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel) = 
          (r4v2 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel)
          (r4v7 com.squareup.cash.moneybot.viewmodels.plugins.SlottedCardViewModel)
         binds: [B:13:0x0060, B:21:0x00c9] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // app.cash.broadway.presenter.molecule.MoleculeCallbackPresenter
    public final app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel models(androidx.compose.runtime.Composer r25) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.moneybot.presenters.plugins.BriefPresenter.models(androidx.compose.runtime.Composer):app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel");
    }

    public BriefPresenter(TextCard textCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.metadata = textCard;
        this.onMessage = function2;
    }

    public BriefPresenter(SlottedCard slottedCard, PluginContext pluginContext, BetterNavigator.ScreenNavigator screenNavigator, Function2 function2) {
        function2.getClass();
        this.metadata = slottedCard;
        this.onMessage = function2;
    }
}
