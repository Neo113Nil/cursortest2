package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextAlign;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.serialization.json.JsonElementBuildersKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ CharSequence f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$10;
    public final /* synthetic */ long f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ boolean f$13;
    public final /* synthetic */ int f$14;
    public final /* synthetic */ int f$15;
    public final /* synthetic */ TextStyle f$17;
    public final /* synthetic */ int f$18;
    public final /* synthetic */ int f$19;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ int f$20;
    public final /* synthetic */ long f$4;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ long f$8;

    public /* synthetic */ TextKt$$ExternalSyntheticLambda3(AnnotatedString annotatedString, TextStyle textStyle, Modifier modifier, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, Map map, Function1 function1, int i4, int i5, int i6) {
        this.f$0 = annotatedString;
        this.f$17 = textStyle;
        this.f$1 = modifier;
        this.f$2 = j;
        this.f$4 = j2;
        this.f$8 = j3;
        this.f$11 = j4;
        this.f$12 = i;
        this.f$13 = z;
        this.f$14 = i2;
        this.f$15 = i3;
        this.f$7 = map;
        this.f$10 = function1;
        this.f$18 = i4;
        this.f$19 = i5;
        this.f$20 = i6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(this.f$18 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$19);
                TextKt.m561TextNvy7gAk((String) this.f$0, this.f$1, this.f$2, this.f$4, (FontFamily) this.f$7, this.f$8, (TextAlign) this.f$10, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, this.f$17, (Composer) obj, updateChangedFlags, updateChangedFlags2, this.f$20);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(this.f$18 | 1);
                int updateChangedFlags4 = Updater.updateChangedFlags(this.f$19);
                JsonElementBuildersKt.m4212MarkdownBasicTexteIOHA4g((AnnotatedString) this.f$0, this.f$17, this.f$1, this.f$2, this.f$4, this.f$8, this.f$11, this.f$12, this.f$13, this.f$14, this.f$15, (Map) this.f$7, (Function1) this.f$10, (Composer) obj, updateChangedFlags3, updateChangedFlags4, this.f$20);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ TextKt$$ExternalSyntheticLambda3(String str, Modifier modifier, long j, long j2, FontFamily fontFamily, long j3, TextAlign textAlign, long j4, int i, boolean z, int i2, int i3, TextStyle textStyle, int i4, int i5, int i6) {
        this.f$0 = str;
        this.f$1 = modifier;
        this.f$2 = j;
        this.f$4 = j2;
        this.f$7 = fontFamily;
        this.f$8 = j3;
        this.f$10 = textAlign;
        this.f$11 = j4;
        this.f$12 = i;
        this.f$13 = z;
        this.f$14 = i2;
        this.f$15 = i3;
        this.f$17 = textStyle;
        this.f$18 = i4;
        this.f$19 = i5;
        this.f$20 = i6;
    }
}
