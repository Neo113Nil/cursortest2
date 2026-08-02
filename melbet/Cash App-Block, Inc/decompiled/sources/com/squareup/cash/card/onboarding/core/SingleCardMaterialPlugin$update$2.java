package com.squareup.cash.card.onboarding.core;

import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.core.SingleCardMaterialPlugin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class SingleCardMaterialPlugin$update$2 extends SuspendLambda implements Function1 {
    public final /* synthetic */ long $keyCreationTime;
    public final /* synthetic */ CardTextureKeys $newKeys;
    public final /* synthetic */ CardModelView.ViewModel $newViewModel;
    public final /* synthetic */ long $totalStartTime;
    public int I$0;
    public long J$0;
    public long J$1;
    public Mutex L$0;
    public SingleCardMaterialPlugin L$1;
    public CardModelView.ViewModel L$2;
    public CardTextureKeys L$3;
    public SingleCardMaterialPlugin.TextureSet L$4;
    public int label;
    public final /* synthetic */ SingleCardMaterialPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleCardMaterialPlugin$update$2(SingleCardMaterialPlugin singleCardMaterialPlugin, CardModelView.ViewModel viewModel, CardTextureKeys cardTextureKeys, long j, long j2, Continuation continuation) {
        super(1, continuation);
        this.this$0 = singleCardMaterialPlugin;
        this.$newViewModel = viewModel;
        this.$newKeys = cardTextureKeys;
        this.$totalStartTime = j;
        this.$keyCreationTime = j2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SingleCardMaterialPlugin$update$2(this.this$0, this.$newViewModel, this.$newKeys, this.$totalStartTime, this.$keyCreationTime, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((SingleCardMaterialPlugin$update$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.cash.card.onboarding.core.SingleCardMaterialPlugin$update$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
