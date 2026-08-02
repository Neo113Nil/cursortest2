package androidx.compose.foundation.layout;

import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class Arrangement$End$1 implements Arrangement$Horizontal {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Arrangement$End$1(int i) {
        this.$r8$classId = i;
    }

    public static final AndroidWindowInsets access$systemInsets(int i, String str) {
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        return new AndroidWindowInsets(i, str);
    }

    public static final ValueInsets access$valueInsetsIgnoringVisibility(int i, String str) {
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        return new ValueInsets(new InsetsValues(0, 0, 0, 0), str);
    }

    public static WindowInsetsHolder current(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        View view = (View) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalView);
        WindowInsetsHolder orCreateFor = getOrCreateFor(view);
        boolean changedInstance = gapComposer.changedInstance(orCreateFor) | gapComposer.changedInstance(view);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new Recomposer$$ExternalSyntheticLambda4(9, orCreateFor, view);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.DisposableEffect(orCreateFor, (Function1) rememberedValue, gapComposer);
        return orCreateFor;
    }

    public static WindowInsetsHolder getOrCreateFor(View view) {
        WindowInsetsHolder windowInsetsHolder;
        WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new WindowInsetsHolder(view);
                    weakHashMap.put(view, obj);
                }
                windowInsetsHolder = (WindowInsetsHolder) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return windowInsetsHolder;
    }

    @Override // androidx.compose.foundation.layout.Arrangement$Horizontal
    public void arrange(Density density, int i, int[] iArr, LayoutDirection layoutDirection, int[] iArr2) {
        int i2 = 0;
        switch (this.$r8$classId) {
            case 0:
                if (layoutDirection == LayoutDirection.Ltr) {
                    int i3 = 0;
                    for (int i4 : iArr) {
                        i3 += i4;
                    }
                    int length = iArr.length;
                    int i5 = i - i3;
                    int i6 = 0;
                    while (i2 < length) {
                        int i7 = iArr[i2];
                        iArr2[i6] = i5;
                        i5 += i7;
                        i2++;
                        i6++;
                    }
                    break;
                } else {
                    for (int length2 = iArr.length - 1; -1 < length2; length2--) {
                        int i8 = iArr[length2];
                        iArr2[length2] = i2;
                        i2 += i8;
                    }
                    break;
                }
            default:
                if (layoutDirection == LayoutDirection.Ltr) {
                    int length3 = iArr.length;
                    int i9 = 0;
                    int i10 = 0;
                    while (i2 < length3) {
                        int i11 = iArr[i2];
                        iArr2[i9] = i10;
                        i10 += i11;
                        i2++;
                        i9++;
                    }
                    break;
                } else {
                    int length4 = iArr.length;
                    int i12 = 0;
                    while (i2 < length4) {
                        i12 += iArr[i2];
                        i2++;
                    }
                    int i13 = i - i12;
                    for (int length5 = iArr.length - 1; -1 < length5; length5--) {
                        int i14 = iArr[length5];
                        iArr2[length5] = i13;
                        i13 += i14;
                    }
                    break;
                }
        }
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                return "Arrangement#End";
            case 1:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
