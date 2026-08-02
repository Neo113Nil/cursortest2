package com.squareup.cash.db2.payment;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.sqldelight.driver.android.AndroidStatement;
import com.squareup.cash.banking.viewmodels.OverdraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final /* synthetic */ class PendingPaymentQueries$$ExternalSyntheticLambda12 implements Function1 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ long f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ PendingPaymentQueries$$ExternalSyntheticLambda12(long j, long j2, String str) {
        this.f$0 = j;
        this.f$1 = j2;
        this.f$2 = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$2;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                androidStatement.bindLong(0, Long.valueOf(this.f$0));
                androidStatement.bindLong(1, Long.valueOf(this.f$1));
                androidStatement.bindString(2, (String) obj2);
                break;
            default:
                DrawScope drawScope = (DrawScope) obj;
                drawScope.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                float f = ((OverdraftViewModel.Loaded.OverdraftUsageViewModel) obj2).percentageUsed * intBitsToFloat;
                drawScope.mo729drawLineNGM6Ib0(this.f$0, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (r23 & 8) != 0 ? 0.0f : 24.0f, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                if (f > RecyclerView.DECELERATION_RATE) {
                    drawScope.mo729drawLineNGM6Ib0(this.f$1, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32), (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : 24.0f, (r23 & 16) != 0 ? 0 : 1, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PendingPaymentQueries$$ExternalSyntheticLambda12(OverdraftViewModel.Loaded.OverdraftUsageViewModel overdraftUsageViewModel, long j, long j2) {
        this.f$2 = overdraftUsageViewModel;
        this.f$0 = j;
        this.f$1 = j2;
    }
}
