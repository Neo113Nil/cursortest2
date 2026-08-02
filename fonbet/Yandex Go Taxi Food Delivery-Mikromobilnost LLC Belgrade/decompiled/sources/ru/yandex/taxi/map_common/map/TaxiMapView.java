package ru.yandex.taxi.map_common.map;

import android.animation.TimeInterpolator;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.GestureFocusPointMode;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapMode;
import com.yandex.mapkit.map.MapWindow;
import com.yandex.mapkit.map.SizeChangedListener;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.mapkit.traffic.TrafficLayer;
import defpackage.au50;
import defpackage.bs00;
import defpackage.cs00;
import defpackage.ds00;
import defpackage.el00;
import defpackage.es00;
import defpackage.gh00;
import defpackage.js00;
import defpackage.jxi;
import defpackage.kgx;
import defpackage.nwy0;
import defpackage.ol00;
import defpackage.qwx0;
import defpackage.t300;
import defpackage.tls;
import defpackage.ut7;
import defpackage.wsg;
import defpackage.zg00;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;
import ru.yandex.video.m3.player.ui.debug.view.graph.DebugGraphView;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u009c\u00012\u00020\u00012\u00020\u0002:\u0002\u009d\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0013J\r\u0010\u001f\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010\u0013J)\u0010%\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J/\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0007H\u0014¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u000f2\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u000201¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0014¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0007¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0007¢\u0006\u0004\b<\u0010;J\u0015\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=¢\u0006\u0004\bA\u0010@J\u0017\u0010D\u001a\u0004\u0018\u00010-2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u0004\u0018\u00010B2\u0006\u0010F\u001a\u00020-¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u000f¢\u0006\u0004\bM\u0010\u0013J\r\u0010N\u001a\u00020\u000f¢\u0006\u0004\bN\u0010\u0013J\u000f\u0010P\u001a\u00020OH\u0017¢\u0006\u0004\bP\u0010QJ\u0017\u0010T\u001a\u0002012\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010W\u001a\u0002012\u0006\u0010V\u001a\u00020RH\u0016¢\u0006\u0004\bW\u0010UJ\u0015\u0010Y\u001a\u00020\u000f2\u0006\u0010X\u001a\u000201¢\u0006\u0004\bY\u0010ZJ!\u0010^\u001a\u00020\u000f2\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\u000f0[¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u000fH\u0014¢\u0006\u0004\b`\u0010\u0013J\u000f\u0010a\u001a\u00020\u000fH\u0014¢\u0006\u0004\ba\u0010\u0013J\u0017\u0010d\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u000201H\u0016¢\u0006\u0004\bf\u0010gJ\u0015\u0010h\u001a\u00020\u000f2\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bh\u0010eJ\u000f\u0010i\u001a\u00020\u000fH\u0002¢\u0006\u0004\bi\u0010\u0013J\u0019\u0010l\u001a\u0004\u0018\u00010j2\u0006\u0010k\u001a\u00020jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bn\u00109J\u0017\u0010o\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bo\u00109R\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR0\u0010u\u001a\u001e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=0sj\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020=`t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0018\u0010w\u001a\u0004\u0018\u00010\\8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0016\u0010|\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0016\u0010~\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010}R\u0017\u0010\u007f\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001b\u0010\u0081\u0001\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R\u0017\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b2\u0010\u0080\u0001R\u0017\u00103\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b3\u0010\u0080\u0001R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u000e\u0010\u0087\u0001R'\u0010\u0088\u0001\u001a\u0010\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u000f\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0019\u0010\u008a\u0001\u001a\u0002018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0080\u0001R,\u0010\u0015\u001a\u0004\u0018\u00010\u00142\t\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00148\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0005\b\u0015\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001a\u0010\u0090\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R-\u0010\u0096\u0001\u001a\u0004\u0018\u00010j2\b\u0010k\u001a\u0004\u0018\u00010j8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R-\u0010\u009b\u0001\u001a\u0004\u0018\u00010-2\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010-8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0005\b\u009a\u0001\u00100¨\u0006\u009e\u0001"}, d2 = {"Lru/yandex/taxi/map_common/map/TaxiMapView;", "Lcom/yandex/mapkit/mapview/MapView;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzg00;", "mapControllerViewBinder", "Lel00;", "mapKitManager", "Lzy11;", "attachController", "(Lzg00;Lel00;)V", "detachController", "()V", "Ljs00;", "mapStyleConfig", "setMapStyleConfig", "(Ljs00;)V", "", "style", "applyMapStyle", "(Ljava/lang/String;)V", "styleIndex", "(ILjava/lang/String;)V", "forceDriveMode", "restoreDefaultMode", "Landroid/view/View;", "child", "index", "Landroid/view/ViewGroup$LayoutParams;", "params", "addView", "(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Lcom/yandex/mapkit/ScreenPoint;", IssuingDistributionPointExtension.POINT, "setFocusPoint", "(Lcom/yandex/mapkit/ScreenPoint;)V", "", "debugFocusRectEnabled", "debugFocusPointEnabled", "setDebugFocusEnabled", "(ZZ)V", "Landroid/graphics/Canvas;", "canvas", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "width", "()I", "height", "Lcom/yandex/mapkit/map/SizeChangedListener;", "listener", "addSizeChangedListener", "(Lcom/yandex/mapkit/map/SizeChangedListener;)V", "removeSizeChangedListener", "Lcom/yandex/mapkit/geometry/Point;", "worldPoint", "worldToScreen", "(Lcom/yandex/mapkit/geometry/Point;)Lcom/yandex/mapkit/ScreenPoint;", "screenPoint", "screenToWorld", "(Lcom/yandex/mapkit/ScreenPoint;)Lcom/yandex/mapkit/geometry/Point;", "Lcom/yandex/mapkit/map/GestureFocusPointMode;", "gestureFocusPointMode", "setGestureFocusPointMode", "(Lcom/yandex/mapkit/map/GestureFocusPointMode;)V", "scaleOut", "scaleIn", "Lcom/yandex/mapkit/map/Map;", "getMap", "()Lcom/yandex/mapkit/map/Map;", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "ev", "dispatchTouchEvent", "isJamsVisible", "setJamsVisible", "(Z)V", "Lkotlin/Function1;", "Lcom/yandex/mapkit/traffic/TrafficLayer;", "provideAction", "provideTrafficLayer", "(Ltls;)V", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "applyThemeForChildrenByDefault", "()Z", "applyThemeType", "initScaleOnDrag", "Lcom/yandex/mapkit/ScreenRect;", "rect", "safeRect", "(Lcom/yandex/mapkit/ScreenRect;)Lcom/yandex/mapkit/ScreenRect;", "drawDebugFocusRect", "drawDebugFocusPoint", "Landroid/animation/TimeInterpolator;", "scaleInterpolator", "Landroid/animation/TimeInterpolator;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "sizeChangedListenerWrappers", "Ljava/util/HashMap;", "trafficLayer", "Lcom/yandex/mapkit/traffic/TrafficLayer;", "Landroid/view/TextureView;", "textureView", "Landroid/view/TextureView;", "horizontalPadding", CA20Status.STATUS_USER_I, "verticalPadding", "scaledOut", "Z", "defaultScreenRect", "Lcom/yandex/mapkit/ScreenRect;", "Landroid/graphics/Paint;", "debugFocusRectPaint", "Landroid/graphics/Paint;", "debugFocusPointPaint", "Lel00;", "setNightModeEnabledCallback", "Ltls;", "isMapTouched", "value", "Ljs00;", "getMapStyleConfig", "()Ljs00;", "Landroid/content/ComponentCallbacks2;", "lowMemoryCallback", "Landroid/content/ComponentCallbacks2;", "getFocusRect", "()Lcom/yandex/mapkit/ScreenRect;", "setFocusRect", "(Lcom/yandex/mapkit/ScreenRect;)V", "focusRect", "zoomFocusPoint", "getGestureFocusPoint", "()Lcom/yandex/mapkit/ScreenPoint;", "setGestureFocusPoint", "gestureFocusPoint", "Companion", "qwx0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TaxiMapView extends MapView implements nwy0 {
    private static final qwx0 Companion = new qwx0();
    private static final long DRAG_END_ZOOM_DURATION_MS = 500;
    private static final float DRAG_SCALE_FACTOR = 0.97f;
    private static final long DRAG_START_ZOOM_DURATION_MS = 1000;
    private static final float MIN_RECT_SIZE = 1.0f;
    private static final String TRAFFIC_STYLE = "[{\"featureType\":\"all\",\"stylers\":{\"lightness\":\"0.3\"}}]";
    private boolean debugFocusPointEnabled;
    private Paint debugFocusPointPaint;
    private boolean debugFocusRectEnabled;
    private Paint debugFocusRectPaint;
    private ScreenRect defaultScreenRect;
    private int horizontalPadding;
    public boolean isMapTouched;
    private ComponentCallbacks2 lowMemoryCallback;
    private el00 mapKitManager;
    private js00 mapStyleConfig;
    private final TimeInterpolator scaleInterpolator;
    private boolean scaledOut;
    private tls setNightModeEnabledCallback;
    private final HashMap<SizeChangedListener, SizeChangedListener> sizeChangedListenerWrappers;
    private TextureView textureView;
    private TrafficLayer trafficLayer;
    private int verticalPadding;

    public TaxiMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.scaleInterpolator = new AccelerateDecelerateInterpolator();
        this.sizeChangedListenerWrappers = new HashMap<>();
        initScaleOnDrag();
        if (isInEditMode()) {
            return;
        }
        Map map = getMapWindow().getMap();
        map.setRotateGesturesEnabled(false);
        map.setTiltGesturesEnabled(false);
        map.setModelsEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSizeChangedListener$lambda$0(SizeChangedListener sizeChangedListener, TaxiMapView taxiMapView, MapWindow mapWindow, int i, int i2) {
        sizeChangedListener.onMapWindowSizeChanged(mapWindow, i - (taxiMapView.horizontalPadding * 2), i2 - (taxiMapView.verticalPadding * 2));
    }

    private final void drawDebugFocusPoint(Canvas canvas) {
        ScreenPoint focusPoint = getMapWindow().getFocusPoint();
        if (focusPoint == null) {
            return;
        }
        ScreenPoint screenPoint = new ScreenPoint(focusPoint.getX() - this.horizontalPadding, focusPoint.getY() - this.verticalPadding);
        Paint paint = this.debugFocusPointPaint;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(DebugGraphView.DEFAULT_GRAPH_COLOR);
            paint.setStrokeWidth(3.0f);
            paint.setStyle(Paint.Style.STROKE);
            this.debugFocusPointPaint = paint;
        }
        Paint paint2 = paint;
        canvas.drawLine(screenPoint.getX() - 20.0f, screenPoint.getY() - 20.0f, screenPoint.getX() + 20.0f, screenPoint.getY() + 20.0f, paint2);
        canvas.drawLine(screenPoint.getX() - 20.0f, screenPoint.getY() + 20.0f, screenPoint.getX() + 20.0f, screenPoint.getY() - 20.0f, paint2);
    }

    private final void drawDebugFocusRect(Canvas canvas) {
        ScreenRect focusRect = getFocusRect();
        if (focusRect == null) {
            return;
        }
        Paint paint = this.debugFocusRectPaint;
        if (paint == null) {
            paint = new Paint();
            paint.setColor(-65536);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
            this.debugFocusRectPaint = paint;
        }
        Paint paint2 = paint;
        canvas.drawRect(focusRect.getTopLeft().getX(), focusRect.getTopLeft().getY(), focusRect.getBottomRight().getX(), focusRect.getBottomRight().getY(), paint2);
        canvas.drawLine(focusRect.getTopLeft().getX(), focusRect.getTopLeft().getY(), focusRect.getBottomRight().getX(), focusRect.getBottomRight().getY(), paint2);
        canvas.drawLine(focusRect.getBottomRight().getX(), focusRect.getTopLeft().getY(), focusRect.getTopLeft().getX(), focusRect.getBottomRight().getY(), paint2);
    }

    private final void initScaleOnDrag() {
        setClipToPadding(false);
        ((WindowManager) getContext().getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(new DisplayMetrics());
        int i = (int) (r0.widthPixels * 0.029999971f);
        this.horizontalPadding = i;
        int i2 = (int) (r0.heightPixels * 0.029999971f);
        this.verticalPadding = i2;
        setPadding(-i, -i2, -i, -i2);
    }

    private final ScreenRect safeRect(ScreenRect rect) {
        ScreenRect screenRect = this.defaultScreenRect;
        if (screenRect == null) {
            return null;
        }
        ScreenPoint topLeft = rect.getTopLeft();
        ScreenPoint bottomRight = rect.getBottomRight();
        float x = topLeft.getX() + this.horizontalPadding;
        float x2 = bottomRight.getX() + this.horizontalPadding;
        float y = topLeft.getY() + this.verticalPadding;
        float y2 = bottomRight.getY() + this.verticalPadding;
        ScreenPoint topLeft2 = screenRect.getTopLeft();
        ScreenPoint bottomRight2 = screenRect.getBottomRight();
        float x3 = topLeft2.getX();
        float x4 = bottomRight2.getX();
        float y3 = topLeft2.getY();
        float y4 = bottomRight2.getY();
        if (x < x3) {
            x = x3;
        }
        float f = x4 - 1.0f;
        if (x > f) {
            x = f;
        }
        if (y < y3) {
            y = y3;
        }
        float f2 = y4 - 1.0f;
        if (y > f2) {
            y = f2;
        }
        if (x2 > x4) {
            x2 = x4;
        }
        float f3 = x3 + 1.0f;
        if (x2 < f3) {
            x2 = f3;
        }
        if (y2 > y4) {
            y2 = y4;
        }
        float f4 = y3 + 1.0f;
        if (y2 < f4) {
            y2 = f4;
        }
        float f5 = x2 - 1.0f;
        if (x <= f5) {
            f5 = x;
        }
        float f6 = y2 - 1.0f;
        if (y <= f6) {
            f6 = y;
        }
        ScreenPoint screenPoint = new ScreenPoint(f5, f6);
        float f7 = x + 1.0f;
        if (f7 >= x2) {
            x2 = f7;
        }
        float f8 = y + 1.0f;
        if (f8 >= y2) {
            y2 = f8;
        }
        return new ScreenRect(screenPoint, new ScreenPoint(x2, y2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 setJamsVisible$lambda$0(boolean z, TrafficLayer trafficLayer) {
        trafficLayer.setTrafficStyle(TRAFFIC_STYLE);
        trafficLayer.setTrafficVisible(z);
        return zy11.a;
    }

    public final void addSizeChangedListener(final SizeChangedListener listener) {
        SizeChangedListener sizeChangedListener = this.sizeChangedListenerWrappers.get(listener);
        if (sizeChangedListener == null) {
            sizeChangedListener = new SizeChangedListener() { // from class: pwx0
                @Override // com.yandex.mapkit.map.SizeChangedListener
                public final void onMapWindowSizeChanged(MapWindow mapWindow, int i, int i2) {
                    TaxiMapView.addSizeChangedListener$lambda$0(SizeChangedListener.this, this, mapWindow, i, i2);
                }
            };
            this.sizeChangedListenerWrappers.put(listener, sizeChangedListener);
        }
        getMapWindow().addSizeChangedListener(sizeChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        super.addView(child, index, params);
        if (child instanceof TextureView) {
            this.textureView = (TextureView) child;
        }
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public final void applyMapStyle(String style) {
        getMapWindow().getMap().setMapStyle(style);
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        applyThemeType(themeType);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void applyThemeType(ThemeType themeType) {
        tls tlsVar = this.setNightModeEnabledCallback;
        if (tlsVar != null) {
            tlsVar.invoke(Boolean.valueOf(themeType == ThemeType.DARK));
        }
    }

    public final void attachController(zg00 mapControllerViewBinder, el00 mapKitManager) {
        Map map;
        if (isInEditMode()) {
            return;
        }
        this.setNightModeEnabledCallback = ((e) mapControllerViewBinder).a;
        Map map2 = getMapWindow().getMap();
        gh00 gh00Var = ((e) mapControllerViewBinder).b;
        gh00Var.d.setValue(gh00Var, gh00.j[0], this);
        ArrayList arrayList = gh00Var.h;
        if (map2 != null) {
            map2.setNightModeEnabled(gh00Var.c);
            map = map2;
        } else {
            map = null;
        }
        gh00Var.b = map;
        es00 es00Var = gh00Var.e;
        au50 au50Var = es00Var.b;
        kgx[] kgxVarArr = es00.f;
        au50Var.setValue(es00Var, kgxVarArr[1], this);
        es00Var.a.setValue(es00Var, kgxVarArr[0], map2);
        t300 t300Var = gh00Var.f;
        t300Var.c();
        map2.addTapListener((ol00) t300Var.f);
        map2.addInputListener((ds00) t300Var.d);
        map2.addCameraListener((bs00) t300Var.e);
        map2.addInertiaMoveListener((cs00) t300Var.g);
        t300Var.c = map2;
        gh00Var.a.a = this;
        ut7 ut7Var = gh00Var.g;
        au50 au50Var2 = ut7Var.c;
        kgx[] kgxVarArr2 = ut7.d;
        au50Var2.setValue(ut7Var, kgxVarArr2[1], this);
        ut7Var.b.setValue(ut7Var, kgxVarArr2[0], map2);
        gh00Var.i.l(map2.getMapObjects());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(this);
        }
        arrayList.clear();
        this.mapKitManager = mapKitManager;
    }

    public final void detachController() {
        this.setNightModeEnabledCallback = null;
        this.mapKitManager = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        this.isMapTouched = (ev.getAction() == 1 || ev.getAction() == 3) ? false : true;
        return isEnabled() && super.dispatchTouchEvent(ev);
    }

    public final void forceDriveMode() {
        getMapWindow().getMap().setMode(MapMode.DRIVING);
    }

    public final ScreenRect getFocusRect() {
        ScreenRect focusRect = getMapWindow().getFocusRect();
        if (focusRect == null) {
            return null;
        }
        int i = -this.horizontalPadding;
        int i2 = -this.verticalPadding;
        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
        return new ScreenRect(ru.yandex.taxi.map.utils.a.x(focusRect.getTopLeft(), i, i2), ru.yandex.taxi.map.utils.a.x(focusRect.getBottomRight(), i, i2));
    }

    public final ScreenPoint getGestureFocusPoint() {
        ScreenPoint gestureFocusPoint = getMapWindow().getGestureFocusPoint();
        if (gestureFocusPoint == null) {
            return null;
        }
        return ru.yandex.taxi.map.utils.a.x(gestureFocusPoint, -this.horizontalPadding, -this.verticalPadding);
    }

    @Override // com.yandex.mapkit.mapview.MapView
    @jxi
    public Map getMap() {
        throw new UnsupportedOperationException("Use getMapController instead");
    }

    public final js00 getMapStyleConfig() {
        return this.mapStyleConfig;
    }

    public final int height() {
        return getMapWindow().height() - (this.verticalPadding * 2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.defaultScreenRect = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.defaultScreenRect = new ScreenRect(new ScreenPoint(this.horizontalPadding, this.verticalPadding), new ScreenPoint(w + this.horizontalPadding, h + this.verticalPadding));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return isEnabled() && super.onTouchEvent(event);
    }

    public final void provideTrafficLayer(tls provideAction) {
        TrafficLayer trafficLayer = this.trafficLayer;
        if (trafficLayer != null) {
            provideAction.invoke(trafficLayer);
            return;
        }
        el00 el00Var = this.mapKitManager;
        if (el00Var != null) {
            el00Var.f(true, new TaxiMapView$provideTrafficLayer$2(this, provideAction, null));
        }
    }

    public final void removeSizeChangedListener(SizeChangedListener listener) {
        SizeChangedListener remove = this.sizeChangedListenerWrappers.remove(listener);
        if (remove != null) {
            getMapWindow().removeSizeChangedListener(remove);
        }
    }

    public final void restoreDefaultMode() {
        getMapWindow().getMap().setMode(MapMode.MAP);
    }

    public final void scaleIn() {
        TextureView textureView = this.textureView;
        if (textureView == null || !this.scaledOut) {
            return;
        }
        this.scaledOut = false;
        if (textureView != null) {
            textureView.animate().cancel();
            textureView.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(this.scaleInterpolator).setDuration(500L);
        }
    }

    public final void scaleOut() {
        TextureView textureView = this.textureView;
        if (textureView == null || this.scaledOut) {
            return;
        }
        this.scaledOut = true;
        if (textureView != null) {
            textureView.animate().cancel();
            textureView.animate().scaleX(DRAG_SCALE_FACTOR).scaleY(DRAG_SCALE_FACTOR).setInterpolator(this.scaleInterpolator).setDuration(1000L);
        }
    }

    public final Point screenToWorld(ScreenPoint screenPoint) {
        return getMapWindow().screenToWorld(ru.yandex.taxi.map.utils.a.x(screenPoint, this.horizontalPadding, this.verticalPadding));
    }

    public final void setDebugFocusEnabled(boolean debugFocusRectEnabled, boolean debugFocusPointEnabled) {
        this.debugFocusRectEnabled = debugFocusRectEnabled;
        this.debugFocusPointEnabled = debugFocusPointEnabled;
    }

    public final void setFocusPoint(ScreenPoint point) {
        getMapWindow().setFocusPoint(point);
        if (this.debugFocusPointEnabled) {
            postInvalidate();
        }
    }

    public final void setFocusRect(ScreenRect screenRect) {
        ScreenRect safeRect = screenRect != null ? safeRect(screenRect) : this.defaultScreenRect;
        getMapWindow().setFocusRect(safeRect);
        TextureView textureView = this.textureView;
        if (textureView != null) {
            textureView.setPivotX(textureView.getWidth() / 2.0f);
            textureView.setPivotY((safeRect == null ? textureView.getHeight() : safeRect.getBottomRight().getY() + safeRect.getTopLeft().getY()) / 2.0f);
        }
        if (this.debugFocusRectEnabled) {
            postInvalidate();
        }
    }

    public final void setGestureFocusPoint(ScreenPoint screenPoint) {
        getMapWindow().setGestureFocusPoint(screenPoint != null ? ru.yandex.taxi.map.utils.a.x(screenPoint, this.horizontalPadding, this.verticalPadding) : null);
    }

    public final void setGestureFocusPointMode(GestureFocusPointMode gestureFocusPointMode) {
        getMapWindow().setGestureFocusPointMode(gestureFocusPointMode);
    }

    public final void setJamsVisible(boolean isJamsVisible) {
        TrafficLayer trafficLayer = this.trafficLayer;
        if (trafficLayer == null || trafficLayer.isTrafficVisible() != isJamsVisible) {
            provideTrafficLayer(new wsg(isJamsVisible, 2));
        }
    }

    public final void setMapStyleConfig(js00 mapStyleConfig) {
        this.mapStyleConfig = mapStyleConfig;
    }

    public final int width() {
        return getMapWindow().width() - (this.horizontalPadding * 2);
    }

    public final ScreenPoint worldToScreen(Point worldPoint) {
        ScreenPoint worldToScreen = getMapWindow().worldToScreen(worldPoint);
        if (worldToScreen == null) {
            return null;
        }
        return ru.yandex.taxi.map.utils.a.x(worldToScreen, -this.horizontalPadding, -this.verticalPadding);
    }

    public final void applyMapStyle(int styleIndex, String style) {
        getMapWindow().getMap().setMapStyle(styleIndex, style);
    }

    public TaxiMapView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public TaxiMapView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ TaxiMapView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
