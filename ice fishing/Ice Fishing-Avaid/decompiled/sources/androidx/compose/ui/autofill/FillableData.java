package androidx.compose.ui.autofill;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import kotlin.Metadata;

/* compiled from: FillableData.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\bf\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u0011H\u0016R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/autofill/FillableData;", "", "textValue", "", "getTextValue", "()Ljava/lang/CharSequence;", "booleanValue", "", "getBooleanValue", "()Ljava/lang/Boolean;", "listIndexValue", "", "getListIndexValue", "()Ljava/lang/Integer;", "getListIndexOrDefault", "defaultValue", "dateMillisValue", "", "getDateMillisValue", "()Ljava/lang/Long;", "getDateMillisOrDefault", "Companion", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
/* loaded from: classes.dex */
public interface FillableData {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    Boolean getBooleanValue();

    long getDateMillisOrDefault(long defaultValue);

    Long getDateMillisValue();

    int getListIndexOrDefault(int defaultValue);

    Integer getListIndexValue();

    CharSequence getTextValue();

    /* compiled from: FillableData.kt */
    /* renamed from: androidx.compose.ui.autofill.FillableData$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static Boolean $default$getBooleanValue(FillableData _this) {
            return null;
        }

        public static Long $default$getDateMillisValue(FillableData _this) {
            return null;
        }

        public static Integer $default$getListIndexValue(FillableData _this) {
            return null;
        }

        public static CharSequence $default$getTextValue(FillableData _this) {
            return null;
        }

        public static int $default$getListIndexOrDefault(FillableData _this, int i) {
            Integer listIndexValue = _this.getListIndexValue();
            return listIndexValue != null ? listIndexValue.intValue() : i;
        }

        public static long $default$getDateMillisOrDefault(FillableData _this, long j) {
            Long dateMillisValue = _this.getDateMillisValue();
            return dateMillisValue != null ? dateMillisValue.longValue() : j;
        }
    }

    /* compiled from: FillableData.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/autofill/FillableData$Companion;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }
}
