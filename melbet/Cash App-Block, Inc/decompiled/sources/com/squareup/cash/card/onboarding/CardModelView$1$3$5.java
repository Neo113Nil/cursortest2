package com.squareup.cash.card.onboarding;

import com.google.android.filament.Scene;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.filament.util.Mesh;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Quadruple;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardModelView$1$3$5 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object L$0;
    public final /* synthetic */ CardModelView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardModelView$1$3$5(CardModelView cardModelView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardModelView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CardModelView$1$3$5 cardModelView$1$3$5 = new CardModelView$1$3$5(this.this$0, continuation);
        cardModelView$1$3$5.L$0 = obj;
        return cardModelView$1$3$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardModelView$1$3$5) create((Quadruple) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Quadruple quadruple = (Quadruple) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        CardModelView.ViewModel viewModel = (CardModelView.ViewModel) quadruple.first;
        CardModelView cardModelView = this.this$0;
        Scene scene = cardModelView.getScene();
        Mesh mesh = cardModelView.mesh;
        Integer num = mesh != null ? new Integer(mesh.renderable) : null;
        Mesh mesh2 = cardModelView.meshBack;
        Integer num2 = mesh2 != null ? new Integer(mesh2.renderable) : null;
        Mesh mesh3 = cardModelView.contouredTextMesh;
        scene.removeEntities(CollectionsKt.toIntArray(ArraysKt___ArraysKt.filterNotNull(new Integer[]{num, num2, mesh3 != null ? new Integer(mesh3.renderable) : null})));
        CardTheme.BackgroundImage backgroundImage = viewModel.backgroundImage;
        if (backgroundImage == CardTheme.BackgroundImage.GLITTER || backgroundImage == CardTheme.BackgroundImage.TORTOISE || viewModel.id == CardTheme.Identifier.HOLO_ID) {
            Scene scene2 = cardModelView.getScene();
            Mesh mesh4 = cardModelView.meshBack;
            mesh4.getClass();
            scene2.addEntity(mesh4.renderable);
        }
        if (viewModel.contouredText != null) {
            Scene scene3 = cardModelView.getScene();
            Mesh mesh5 = cardModelView.contouredTextMesh;
            mesh5.getClass();
            scene3.addEntity(mesh5.renderable);
        }
        Scene scene4 = cardModelView.getScene();
        Mesh mesh6 = cardModelView.mesh;
        mesh6.getClass();
        scene4.addEntity(mesh6.renderable);
        return Unit.INSTANCE;
    }
}
