package bo.app;

import android.graphics.BitmapFactory;
import com.braze.BrazeUser;
import com.braze.enums.Month;
import com.braze.support.BrazeImageUtils;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewEvent;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionBlockerViewModel;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes3.dex */
public final /* synthetic */ class x7$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ x7$$ExternalSyntheticLambda1(int i, Month month, int i2) {
        this.$r8$classId = 1;
        this.f$1 = i;
        this.f$0 = month;
        this.f$2 = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String dateOfBirth$lambda$0;
        String calculateInSampleSize$lambda$1;
        int i = this.$r8$classId;
        int i2 = this.f$2;
        int i3 = this.f$1;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                break;
            case 1:
                dateOfBirth$lambda$0 = BrazeUser.setDateOfBirth$lambda$0(i3, (Month) obj, i2);
                break;
            case 2:
                calculateInSampleSize$lambda$1 = BrazeImageUtils.calculateInSampleSize$lambda$1((BitmapFactory.Options) obj, i3, i2);
                break;
            case 3:
                ((Function1) obj).invoke(new InstrumentSelectionBlockerViewEvent.InstrumentOptionClick(new InstrumentSelectionBlockerViewModel.SelectedInstrumentOptionIndex(i3, i2)));
                break;
            default:
                Http2Connection http2Connection = (Http2Connection) obj;
                try {
                    http2Connection.writer.ping(i3, i2, true);
                } catch (IOException e) {
                    ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.close$okhttp(errorCode, errorCode, e);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x7$$ExternalSyntheticLambda1(Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = i2;
    }
}
