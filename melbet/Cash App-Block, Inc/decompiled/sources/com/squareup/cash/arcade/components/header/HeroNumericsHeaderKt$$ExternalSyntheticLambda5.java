package com.squareup.cash.arcade.components.header;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacg;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class HeroNumericsHeaderKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;

    public /* synthetic */ HeroNumericsHeaderKt$$ExternalSyntheticLambda5(Object obj, Modifier modifier, int i, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i3, int i4) {
        this.$r8$classId = i4;
        this.f$0 = obj;
        this.f$1 = modifier;
        this.f$2 = i;
        this.f$3 = obj2;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$6 = obj5;
        this.f$7 = i2;
        this.f$8 = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$7;
        Object obj3 = this.f$6;
        Object obj4 = this.f$5;
        Object obj5 = this.f$4;
        Object obj6 = this.f$3;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                zzacg.m2010HeroNumericsHeadertv5qRRQ((String) obj7, this.f$1, this.f$2, (String) obj6, (String) obj5, (String) obj4, (String) obj3, (Composer) obj, updateChangedFlags, this.f$8);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                zzacg.m2009HeroNumericsHeadertv5qRRQ((ComposableLambdaImpl) obj7, this.f$1, this.f$2, (Function2) obj6, (Function3) obj5, (Function3) obj4, (Function2) obj3, (Composer) obj, updateChangedFlags2, this.f$8);
                break;
        }
        return Unit.INSTANCE;
    }
}
