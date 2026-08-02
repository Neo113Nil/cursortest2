package com.yandex.music.shared.radio.domain.commands;

import defpackage.aur;
import defpackage.khn;
import defpackage.mhn;
import defpackage.nm6;
import defpackage.pyc;
import defpackage.qgg;
import defpackage.s8q;
import defpackage.w5j;
import defpackage.x0q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class b extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ s8q k;
    public /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        s8q s8qVar = (s8q) obj;
        switch (this.j) {
            case 0:
                b bVar = new b(3, 0, (Continuation) obj3);
                bVar.k = s8qVar;
                bVar.l = (VideoClipRadioQueueCommandsFactory$Skip) obj2;
                return bVar.invokeSuspend(Unit.a);
            default:
                b bVar2 = new b(3, 1, (Continuation) obj3);
                bVar2.k = s8qVar;
                bVar2.l = (VideoClipRadioQueueCommandsFactory$SetPosition) obj2;
                return bVar2.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                s8q s8qVar = this.k;
                VideoClipRadioQueueCommandsFactory$Skip videoClipRadioQueueCommandsFactory$Skip = (VideoClipRadioQueueCommandsFactory$Skip) this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((x0q) s8qVar.m.c).a(new khn(videoClipRadioQueueCommandsFactory$Skip.getDueToError() ? w5j.b : w5j.c));
                break;
            default:
                s8q s8qVar2 = this.k;
                VideoClipRadioQueueCommandsFactory$SetPosition videoClipRadioQueueCommandsFactory$SetPosition = (VideoClipRadioQueueCommandsFactory$SetPosition) this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                ((x0q) s8qVar2.m.c).a(new mhn(videoClipRadioQueueCommandsFactory$SetPosition.getPosition()));
                break;
        }
        return Unit.a;
    }
}
