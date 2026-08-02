package com.google.android.libraries.places.internal;

import android.content.Context;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.compose.ui.graphics.ColorKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.tracing.Trace;
import com.android.volley.Response;
import com.google.common.base.Ascii;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.portfolio.graphs.views.DataMissing;
import com.squareup.cash.portfolio.graphs.views.Gap;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphPathType;
import com.squareup.cash.portfolio.graphs.views.Loading;
import com.squareup.cash.portfolio.graphs.views.Normal;
import com.squareup.cash.portfolio.graphs.views.NormalGray;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes4.dex */
public final class zzbsy {
    public final /* synthetic */ int $r8$classId = 1;
    public int zza;
    public final Object zzb;
    public final Object zzc;
    public final Object zzd;
    public final Object zze;
    public final Object zzf;
    public Object zzg;
    public Object zzh;
    public Object zzi;

    public zzbsy() {
        Paint paint = new Paint(1);
        this.zzb = paint;
        Paint paint2 = new Paint(1);
        this.zzc = paint2;
        Paint paint3 = new Paint(1);
        this.zzd = paint3;
        Paint paint4 = new Paint(1);
        this.zze = paint4;
        Paint paint5 = new Paint(1);
        this.zzf = paint5;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.set(paint);
        Paint.Style style2 = Paint.Style.FILL;
        paint2.setStyle(style2);
        paint2.setStrokeWidth(RecyclerView.DECELERATION_RATE);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint4.setStyle(style);
        paint5.set(paint);
        paint5.setStyle(style2);
        paint5.setStrokeWidth(RecyclerView.DECELERATION_RATE);
    }

    public Paint getEventPaint(Context context, InvestingGraphPathType investingGraphPathType, int i) {
        context.getClass();
        if (i != 0) {
            return getPaint(context, investingGraphPathType, i, new Paint((Paint) this.zzc));
        }
        throw null;
    }

    public Paint getPaint(Context context, InvestingGraphPathType investingGraphPathType, int i, Paint paint) {
        int m694toArgb8_81llA;
        if (investingGraphPathType == null) {
            return paint;
        }
        if (investingGraphPathType instanceof Normal) {
            Paint paint2 = new Paint(paint);
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
            if (ordinal == 0 || ordinal == 1) {
                Boolean bool = (Boolean) this.zzg;
                m694toArgb8_81llA = bool != null ? bool.booleanValue() : true ? ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(context).arcadeColors.data.trend.positive) : ColorKt.m694toArgb8_81llA(ThemeHelpersKt.themeInfo(context).arcadeColors.data.trend.negative);
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Integer num = (Integer) this.zzh;
                m694toArgb8_81llA = num != null ? num.intValue() : context.getColor(R.color.investing_graph_line_color_gray);
            }
            paint2.setColor(m694toArgb8_81llA);
            paint2.setStrokeWidth(pathStrokeWidthForState(context, i));
            return paint2;
        }
        if (investingGraphPathType instanceof DataMissing) {
            Paint paint3 = new Paint(paint);
            Integer num2 = (Integer) this.zzh;
            paint3.setColor(num2 != null ? num2.intValue() : context.getColor(R.color.investing_graph_line_color_gray));
            paint3.setStrokeWidth(context.getResources().getDimension(R.dimen.investing_graph_line_width_with_smooth_points));
            paint3.setPathEffect(new DashPathEffect(new float[]{2.0f, 20.0f}, RecyclerView.DECELERATION_RATE));
            return paint3;
        }
        if (investingGraphPathType instanceof NormalGray) {
            Paint paint4 = new Paint(paint);
            Integer num3 = (Integer) this.zzh;
            paint4.setColor(num3 != null ? num3.intValue() : context.getColor(R.color.investing_graph_line_color_gray));
            paint4.setStrokeWidth(pathStrokeWidthForState(context, i));
            return paint4;
        }
        if (investingGraphPathType instanceof Gap) {
            Paint paint5 = new Paint(paint);
            paint5.setColor(context.getColor(android.R.color.transparent));
            return paint5;
        }
        if (!(investingGraphPathType instanceof Loading)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        Paint paint6 = new Paint(paint);
        paint6.setColor(ColorKt.m694toArgb8_81llA(Trace.themeInfoWithArcadeColors(context).arcadeColors.semantic.border.subtle));
        paint6.setStrokeWidth(context.getResources().getDimension(R.dimen.investing_graph_line_width_with_smooth_points));
        return paint6;
    }

    public Paint getPathFillPaint(Context context, InvestingGraphPathType investingGraphPathType, int i) {
        context.getClass();
        if (i == 0) {
            throw null;
        }
        Paint paint = new Paint((Paint) this.zzf);
        paint.setColor(context.getColor(android.R.color.white));
        return paint;
    }

    public Paint getPathPaint(Context context, InvestingGraphPathType investingGraphPathType, int i) {
        context.getClass();
        investingGraphPathType.getClass();
        if (i == 0) {
            throw null;
        }
        Paint paint = getPaint(context, investingGraphPathType, i, new Paint((Paint) this.zzb));
        paint.setPathEffect(new CornerPathEffect(context.getResources().getDimension(R.dimen.investing_graph_line_width_with_smooth_points) / 2.0f));
        return paint;
    }

    public float pathStrokeWidthForState(Context context, int i) {
        Float f = (Float) this.zzi;
        if (f != null) {
            return f.floatValue();
        }
        int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(i);
        if (ordinal == 0) {
            return context.getResources().getDimension(R.dimen.investing_graph_line_width_with_smooth_points);
        }
        if (ordinal != 1 && ordinal != 2) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return RecyclerView.DECELERATION_RATE;
        }
        return context.getResources().getDimension(R.dimen.investing_graph_line_width_without_smooth_points);
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 0:
                Response stringHelper = Ascii.toStringHelper(this);
                stringHelper.addUnconditionalHolder("defaultPort", String.valueOf(this.zza));
                stringHelper.add((zzcdt) this.zzb, "proxyDetector");
                stringHelper.add((zzbuf) this.zzc, "syncContext");
                stringHelper.add((zzcfr) this.zzd, "serviceConfigParser");
                stringHelper.add((Object) null, "customArgs");
                stringHelper.add((ScheduledExecutorService) this.zze, "scheduledExecutorService");
                stringHelper.add((zzbvi) this.zzf, "channelLogger");
                stringHelper.add((Executor) this.zzg, "executor");
                stringHelper.add((Object) null, "overrideAuthority");
                stringHelper.add((zzfv) this.zzh, "metricRecorder");
                stringHelper.add((zzbtk) this.zzi, "nameResolverRegistry");
                return stringHelper.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ zzbsy(zzbsx zzbsxVar) {
        Integer num = zzbsxVar.zza;
        Trace.checkNotNull(num, "defaultPort not set");
        this.zza = num.intValue();
        zzcdt zzcdtVar = zzbsxVar.zzb;
        Trace.checkNotNull(zzcdtVar, "proxyDetector not set");
        this.zzb = zzcdtVar;
        zzbuf zzbufVar = zzbsxVar.zzc;
        Trace.checkNotNull(zzbufVar, "syncContext not set");
        this.zzc = zzbufVar;
        zzcfr zzcfrVar = zzbsxVar.zzd;
        Trace.checkNotNull(zzcfrVar, "serviceConfigParser not set");
        this.zzd = zzcfrVar;
        this.zze = zzbsxVar.zze;
        this.zzf = zzbsxVar.zzf;
        this.zzg = zzbsxVar.zzg;
        this.zzh = zzbsxVar.zzh;
        this.zzi = zzbsxVar.zzi;
    }
}
