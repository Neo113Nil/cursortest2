package com.squareup.cash.directory_ui.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.google.android.gms.internal.common.zzai;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ComposeUtilsKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$0;
    public final /* synthetic */ Text f$1;
    public final /* synthetic */ TextStyle f$2;
    public final /* synthetic */ long f$3;
    public final /* synthetic */ Function1 f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;
    public final /* synthetic */ int f$7;
    public final /* synthetic */ Map f$8;

    public /* synthetic */ ComposeUtilsKt$$ExternalSyntheticLambda1(Modifier modifier, Text text, TextStyle textStyle, long j, Function1 function1, int i, int i2, int i3, Map map, int i4, int i5) {
        this.$r8$classId = i5;
        this.f$0 = modifier;
        this.f$1 = text;
        this.f$2 = textStyle;
        this.f$3 = j;
        this.f$4 = function1;
        this.f$5 = i;
        this.f$6 = i2;
        this.f$7 = i3;
        this.f$8 = map;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1);
                ComposeUtilsKt.m3521MooncakeDiscoverTextsSOGCe0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(1);
                ComposeUtilsKt.m3521MooncakeDiscoverTextsSOGCe0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(1);
                zzai.m2001MooncakeDiscoverTextsSOGCe0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(1);
                zzai.m2001MooncakeDiscoverTextsSOGCe0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, (Composer) obj, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }
}
