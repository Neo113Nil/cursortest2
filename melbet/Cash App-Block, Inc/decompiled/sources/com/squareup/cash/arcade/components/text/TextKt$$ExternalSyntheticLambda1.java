package com.squareup.cash.arcade.components.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class TextKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CharSequence f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ TextLineBalancing f$10;
    public final /* synthetic */ Map f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ TextStyle f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ int f$8;
    public final /* synthetic */ boolean f$9;

    public /* synthetic */ TextKt$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, Modifier modifier, TextStyle textStyle, TextLineBalancing textLineBalancing, CharSequence charSequence, Map map, Function1 function1, boolean z) {
        this.$r8$classId = i8;
        this.f$0 = charSequence;
        this.f$1 = modifier;
        this.f$2 = textStyle;
        this.f$3 = j;
        this.f$4 = function1;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = i3;
        this.f$8 = i4;
        this.f$9 = z;
        this.f$10 = textLineBalancing;
        this.f$11 = map;
        this.f$12 = i5;
        this.f$13 = i6;
        this.f$14 = i7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                String str = (String) this.f$0;
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$12 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$13);
                Room.m1165Text25TpFw(this.f$5, this.f$6, this.f$7, this.f$8, updateChangedFlags, updateChangedFlags2, this.f$14, this.f$3, (Composer) obj, this.f$1, this.f$2, this.f$10, str, this.f$11, this.f$4, this.f$9);
                break;
            default:
                AnnotatedString annotatedString = (AnnotatedString) this.f$0;
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$12 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(this.f$13);
                Room.m1164Text25TpFw(this.f$5, this.f$6, this.f$7, this.f$8, updateChangedFlags3, updateChangedFlags4, this.f$14, this.f$3, (Composer) obj, this.f$1, annotatedString, this.f$2, this.f$10, this.f$11, this.f$4, this.f$9);
                break;
        }
        return Unit.INSTANCE;
    }
}
