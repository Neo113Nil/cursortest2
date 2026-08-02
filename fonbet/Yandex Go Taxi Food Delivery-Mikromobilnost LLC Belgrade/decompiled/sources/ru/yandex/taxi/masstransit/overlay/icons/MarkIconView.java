package ru.yandex.taxi.masstransit.overlay.icons;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.e0h0;
import defpackage.eja1;
import defpackage.evu0;
import defpackage.mrg0;
import defpackage.n;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.rw00;
import defpackage.tje;
import defpackage.u8b1;
import defpackage.up11;
import defpackage.v8b1;
import defpackage.vng;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 m2\u00020\u0001:\u0001nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\bJ\u001f\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\t¢\u0006\u0004\b-\u0010\fJ\u0017\u0010/\u001a\u00020\u00062\b\b\u0001\u0010.\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0018J\u0017\u00101\u001a\u00020\u00062\b\u00100\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00062\u0006\u00103\u001a\u00020\tH\u0016¢\u0006\u0004\b4\u0010\fJ\u001f\u00107\u001a\u00020\u00062\u0006\u00105\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\u000fH\u0014¢\u0006\u0004\b7\u0010\u001bJ\u0017\u0010:\u001a\u00020\u00062\u0006\u00109\u001a\u000208H\u0014¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010CR\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010CR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u0014\u0010L\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010GR\u0014\u0010M\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010GR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010SR\u0014\u0010V\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0016\u0010[\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010]\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\\R\u0016\u0010^\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010@R\u0016\u0010a\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010@R\u0016\u0010b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010@R\u0016\u0010c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010@R\u0016\u0010d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010\\R\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\\R\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010fR\u0014\u0010g\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0016\u0010i\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010@R\u0016\u0010j\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010@R\u0018\u00100\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010kR\u0016\u00103\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010lR\u0016\u0010,\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010l¨\u0006o"}, d2 = {"Lru/yandex/taxi/masstransit/overlay/icons/MarkIconView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lzy11;", "init", "()V", "", "considerMargin", "updateLabelMargin", "(Z)V", "", "deltaX", "", "resultViewWidth", "resultViewHeight", "measureBgLabel", "(FII)V", "deltaY", "measureBlobImage", "(FFII)V", "measureVehicleImagePosition", "(I)V", "measureTextPosition", "measureAnchorPoint", "(II)V", "", "getBlobAzimuth", "()D", "isTextRight", "()Z", "vehicleAzimuth", "setVehicleAzimuth", "(D)V", "", "name", "setVehicleName", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "vehicleBitmap", "setVehicleImage", "(Landroid/graphics/Bitmap;)V", "showLabel", "setShowLabel", "color", "setColor", "blobSize", "setBlobSize", "(Ljava/lang/Integer;)V", "selected", "setSelected", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Landroid/graphics/PointF;", "getAnchorPoint", "()Landroid/graphics/PointF;", "labelPadding", CA20Status.STATUS_USER_I, "labelTrailingPadding", "blobBitmap", "Landroid/graphics/Bitmap;", "blobStrokeBitmap", "Landroid/graphics/Paint;", "labelBgPaint", "Landroid/graphics/Paint;", "Landroid/text/TextPaint;", "textPaint", "Landroid/text/TextPaint;", "blobPaint", "blobStrokePaint", "vehiclePaint", "Landroid/graphics/Rect;", "textRect", "Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "blobRect", "Landroid/graphics/RectF;", "labelBgRectF", "Landroid/graphics/Path;", "labelBgPath", "Landroid/graphics/Path;", "Landroid/graphics/Matrix;", "blobMatrix", "Landroid/graphics/Matrix;", "vehicleImageX", "F", "vehicleImageY", "vehicleName", "Ljava/lang/String;", "defMargin", "textHorizontalMargin", "spaceBetweenLabelAndIcon", "textTrailingPadding", "textPositionX", "textPositionY", CA20Status.STATUS_REQUEST_D, "anchorPoint", "Landroid/graphics/PointF;", "accentColor", "labelAlpha", "Ljava/lang/Integer;", "Z", "Companion", "rw00", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MarkIconView extends View {
    public static final int $stable = 8;
    private static final int BG_LABEL_COLOR = 16777215;
    private static final double BLOB_DEGREE_OFFSET = 45.0d;
    public static final rw00 Companion = new rw00();
    private static final int DEFAULT_LABEL_ALPHA = 229;
    private static final int DEFAULT_LABEL_VERTICAL_MARGIN = 4;
    private static final int LABEL_TEXT_TRAILING_PADDING_DP = 6;
    private static final int SHADOW_COLOR = 639705119;
    private static final int WHITE_COLOR = -1;
    private int accentColor;
    private final PointF anchorPoint;
    private Bitmap blobBitmap;
    private final Matrix blobMatrix;
    private final Paint blobPaint;
    private final RectF blobRect;
    private Integer blobSize;
    private Bitmap blobStrokeBitmap;
    private final Paint blobStrokePaint;
    private final int defMargin;
    private int labelAlpha;
    private final Paint labelBgPaint;
    private final Path labelBgPath;
    private final RectF labelBgRectF;
    private final int labelPadding;
    private final int labelTrailingPadding;
    private boolean selected;
    private boolean showLabel;
    private int spaceBetweenLabelAndIcon;
    private int textHorizontalMargin;
    private final TextPaint textPaint;
    private float textPositionX;
    private float textPositionY;
    private final Rect textRect;
    private int textTrailingPadding;
    private double vehicleAzimuth;
    private Bitmap vehicleBitmap;
    private float vehicleImageX;
    private float vehicleImageY;
    private String vehicleName;
    private final Paint vehiclePaint;

    private MarkIconView(Context context) {
        super(context);
        int u = tje.u(4, getContext());
        this.labelPadding = u;
        int u2 = tje.u(6, getContext());
        this.labelTrailingPadding = u2;
        this.labelBgPaint = new Paint();
        this.textPaint = new TextPaint();
        this.blobPaint = new Paint(2);
        this.blobStrokePaint = new Paint(2);
        this.vehiclePaint = new Paint(2);
        this.textRect = new Rect();
        this.blobRect = new RectF();
        this.labelBgRectF = new RectF();
        this.labelBgPath = new Path();
        this.blobMatrix = new Matrix();
        this.vehicleName = "";
        int r = tje.r(mrg0.go_design_s_space, getContext());
        this.defMargin = r;
        this.textHorizontalMargin = r;
        this.spaceBetweenLabelAndIcon = u;
        this.textTrailingPadding = u2;
        this.anchorPoint = new PointF();
        this.labelAlpha = DEFAULT_LABEL_ALPHA;
        init();
    }

    private final double getBlobAzimuth() {
        double d = this.vehicleAzimuth;
        return d > 315.0d ? (d + BLOB_DEGREE_OFFSET) - 360.0d : d + BLOB_DEGREE_OFFSET;
    }

    private final void init() {
        float u = tje.u(4, getContext());
        this.labelBgPaint.setShadowLayer(u, 0.0f, u / 2.0f, SHADOW_COLOR);
        this.labelBgPaint.setColor(16777215);
        this.labelBgPaint.setAntiAlias(true);
        this.textPaint.setColor(ModalContentViewContainer.BASE_SHADOW_COLOR);
        TextPaint textPaint = this.textPaint;
        int[] iArr = up11.a;
        textPaint.setTypeface(eja1.w(3, 0));
        this.textPaint.setTextSize(tje.r(mrg0.component_text_size_caption, getContext()));
        this.textPaint.setAntiAlias(true);
        this.blobPaint.setAntiAlias(true);
        this.vehiclePaint.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    private final boolean isTextRight() {
        return getBlobAzimuth() > 180.0d;
    }

    private final void measureAnchorPoint(int resultViewWidth, int resultViewHeight) {
        if (resultViewWidth != 0) {
            boolean isTextRight = isTextRight();
            PointF pointF = this.anchorPoint;
            if (isTextRight) {
                pointF.x = ((this.blobRect.width() / 2.0f) + this.textHorizontalMargin) / resultViewWidth;
            } else {
                float f = resultViewWidth;
                pointF.x = (f - ((this.blobRect.width() / 2.0f) + this.textHorizontalMargin)) / f;
            }
        }
        if (resultViewHeight != 0) {
            float f2 = resultViewHeight;
            this.anchorPoint.y = (f2 / 2.0f) / f2;
        }
    }

    private final void measureBgLabel(float deltaX, int resultViewWidth, int resultViewHeight) {
        float f = deltaX / 2.0f;
        float f2 = (resultViewHeight - r0) / 2.0f;
        this.labelBgRectF.set(this.textHorizontalMargin + f, f2, (resultViewWidth - r0) - f, (this.labelPadding * 2) + this.textRect.height() + f2);
        float height = this.labelBgRectF.height() / 2.0f;
        float w = tje.w(8, getContext());
        if (height < w) {
            height = w;
        }
        float w2 = tje.w(8, getContext());
        float[] fArr = isTextRight() ? new float[]{height, height, w2, w2, w2, w2, height, height} : new float[]{w2, w2, height, height, height, height, w2, w2};
        this.labelBgPath.reset();
        this.labelBgPath.addRoundRect(this.labelBgRectF, fArr, Path.Direction.CW);
    }

    private final void measureBlobImage(float deltaX, float deltaY, int resultViewWidth, int resultViewHeight) {
        float height = (resultViewHeight - this.blobStrokeBitmap.getHeight()) / 2.0f;
        boolean isTextRight = isTextRight();
        Matrix matrix = this.blobMatrix;
        if (!isTextRight) {
            matrix.postTranslate(((resultViewWidth - this.textHorizontalMargin) - this.blobStrokeBitmap.getWidth()) - (deltaX / 2.0f), height);
        } else {
            matrix.postTranslate((deltaX / 2.0f) + this.textHorizontalMargin, height);
        }
    }

    private final void measureTextPosition() {
        boolean isTextRight = isTextRight();
        RectF rectF = this.labelBgRectF;
        this.textPositionX = isTextRight ? (rectF.right - this.textTrailingPadding) - this.textRect.width() : rectF.left + this.textTrailingPadding;
        RectF rectF2 = this.labelBgRectF;
        float f = rectF2.top;
        this.textPositionY = (this.textRect.height() / 2.0f) + n.a(rectF2.bottom, f, 2.0f, f);
    }

    private final void measureVehicleImagePosition(int resultViewHeight) {
        float width;
        if (this.vehicleBitmap == null) {
            return;
        }
        boolean isTextRight = isTextRight();
        RectF rectF = this.labelBgRectF;
        if (isTextRight) {
            width = ((this.blobStrokeBitmap.getWidth() / 2.0f) + rectF.left) - (this.vehicleBitmap.getWidth() / 2.0f);
        } else {
            width = (rectF.right - (this.blobStrokeBitmap.getWidth() / 2.0f)) - (this.vehicleBitmap.getWidth() / 2.0f);
        }
        this.vehicleImageX = width;
        this.vehicleImageY = (resultViewHeight - this.vehicleBitmap.getHeight()) / 2.0f;
    }

    private final void updateLabelMargin(boolean considerMargin) {
        this.textHorizontalMargin = considerMargin ? this.defMargin : 0;
        this.spaceBetweenLabelAndIcon = considerMargin ? this.labelPadding : 0;
        this.textTrailingPadding = considerMargin ? this.labelTrailingPadding : 0;
    }

    public final PointF getAnchorPoint() {
        return this.anchorPoint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.showLabel || this.selected) {
            canvas.drawPath(this.labelBgPath, this.labelBgPaint);
            canvas.drawText(this.vehicleName, this.textPositionX, this.textPositionY, this.textPaint);
        }
        canvas.drawBitmap(this.blobStrokeBitmap, this.blobMatrix, this.blobStrokePaint);
        canvas.drawBitmap(this.blobBitmap, this.blobMatrix, this.blobPaint);
        canvas.save();
        canvas.translate(this.vehicleImageX, this.vehicleImageY);
        Bitmap bitmap = this.vehicleBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.vehiclePaint);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        String str = this.vehicleName;
        updateLabelMargin(!(str == null || evu0.J(str)));
        this.textPaint.measureText(this.vehicleName);
        TextPaint textPaint = this.textPaint;
        String str2 = this.vehicleName;
        textPaint.getTextBounds(str2, 0, str2.length(), this.textRect);
        this.blobRect.set(0.0f, 0.0f, this.blobStrokeBitmap.getWidth(), this.blobStrokeBitmap.getHeight());
        this.blobMatrix.reset();
        this.blobMatrix.setRotate((float) getBlobAzimuth(), this.blobStrokeBitmap.getWidth() / 2.0f, this.blobStrokeBitmap.getHeight() / 2.0f);
        this.blobMatrix.mapRect(this.blobRect);
        int width = this.textRect.width() + this.textHorizontalMargin + ((int) this.blobRect.width()) + this.spaceBetweenLabelAndIcon + this.textTrailingPadding + this.textHorizontalMargin;
        float abs = (float) Math.abs(this.blobStrokeBitmap.getWidth() - this.blobRect.width());
        float abs2 = (float) Math.abs(this.blobStrokeBitmap.getHeight() - this.blobRect.height());
        int max = Math.max((int) this.blobRect.height(), (this.labelPadding * 2) + this.textRect.height());
        this.anchorPoint.set(width / 2.0f, max / 2.0f);
        measureBgLabel(abs, width, max);
        measureBlobImage(abs, abs2, width, max);
        measureVehicleImagePosition(max);
        measureTextPosition();
        measureAnchorPoint(width, max);
        setMeasuredDimension(width, max);
    }

    public final void setBlobSize(Integer blobSize) {
        Bitmap c;
        Bitmap c2;
        Context context = getContext();
        int i = e0h0.ic_masstransit_vehicle_blob_two_color_top;
        Drawable t = vng.t(i, context);
        if (t == null) {
            ny61.g(oyr.i(i, "No drawable associated with "));
            return;
        }
        Bitmap createBitmap = Bitmap.createBitmap(t.getIntrinsicWidth(), t.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.save();
        canvas.rotate(90.0f, canvas.getWidth() / 2.0f, canvas.getHeight() / 2.0f);
        t.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        t.draw(canvas);
        canvas.restore();
        Bitmap h = u8b1.h(e0h0.ic_masstransit_vehicle_blob_two_color_bottom, getContext());
        this.blobSize = blobSize;
        if (blobSize != null && (c2 = v8b1.c(createBitmap, blobSize.intValue())) != null) {
            createBitmap = c2;
        }
        this.blobBitmap = createBitmap;
        if (blobSize != null && (c = v8b1.c(h, blobSize.intValue())) != null) {
            h = c;
        }
        this.blobStrokeBitmap = h;
        setColor(this.accentColor);
    }

    public final void setColor(int color) {
        this.accentColor = color;
        Paint paint = this.blobPaint;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.blobStrokePaint.setColorFilter(new PorterDuffColorFilter(color, mode));
        this.textPaint.setColor(color);
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        this.selected = selected;
        Paint paint = this.labelBgPaint;
        if (selected) {
            paint.setColor(this.accentColor);
        } else {
            paint.setColor(16777215);
            this.labelBgPaint.setAlpha(this.labelAlpha);
        }
        this.textPaint.setColor(selected ? -1 : this.accentColor);
    }

    public final void setShowLabel(boolean showLabel) {
        this.showLabel = showLabel;
    }

    public final void setVehicleAzimuth(double vehicleAzimuth) {
        this.vehicleAzimuth = vehicleAzimuth;
    }

    public final void setVehicleImage(Bitmap vehicleBitmap) {
        this.vehicleBitmap = vehicleBitmap;
    }

    public final void setVehicleName(String name) {
        this.vehicleName = name;
    }

    public /* synthetic */ MarkIconView(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }
}
