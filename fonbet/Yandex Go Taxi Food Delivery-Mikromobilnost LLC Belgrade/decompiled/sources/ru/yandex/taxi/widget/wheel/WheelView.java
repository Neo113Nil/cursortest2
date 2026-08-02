package ru.yandex.taxi.widget.wheel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.c4i0;
import defpackage.eja1;
import defpackage.iy41;
import defpackage.jy41;
import defpackage.k4o;
import defpackage.ky41;
import defpackage.mrg0;
import defpackage.mzh0;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.qje;
import defpackage.tje;
import defpackage.up11;
import defpackage.vby;
import defpackage.vd11;
import defpackage.wd11;
import defpackage.x4e;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xz;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000b\b\u0016\u0018\u0000 ²\u00012\u00020\u00012\u00020\u0002:\u0005³\u0001´\u0001sB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\rJ\u0015\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010 J\u0015\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\u000b2\n\u0010&\u001a\u0006\u0012\u0002\b\u00030%¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\b\u0012\u0002\b\u0003\u0018\u00010%¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000b¢\u0006\u0004\b-\u0010\u000fJ\r\u0010.\u001a\u00020\u000b¢\u0006\u0004\b.\u0010\u000fJ\r\u0010/\u001a\u00020\t¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000bH\u0004¢\u0006\u0004\b1\u0010\u000fJ\u0017\u00104\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0014¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\t2\u0006\u00103\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J)\u0010=\u001a\u00020\u000b2\u0006\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u00102\b\u0010<\u001a\u0004\u0018\u00010;H\u0014¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020?H\u0014¢\u0006\u0004\bA\u0010BJ\u001f\u0010E\u001a\u00020\u000b2\u0006\u0010C\u001a\u00020\u00102\u0006\u0010D\u001a\u00020\u0010H\u0014¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\t2\u0006\u00103\u001a\u000202H\u0017¢\u0006\u0004\bG\u00105J\u000f\u0010H\u001a\u00020\tH\u0016¢\u0006\u0004\bH\u00100J\u0017\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010\rJ\r\u0010K\u001a\u00020\u0010¢\u0006\u0004\bK\u0010,J\u0017\u0010N\u001a\u00020\u000b2\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bN\u0010OJ\u0015\u0010Q\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u0010¢\u0006\u0004\bQ\u0010\u001eJ\u001f\u0010U\u001a\u00020\u00102\u0006\u0010S\u001a\u00020R2\b\u0010T\u001a\u0004\u0018\u00010L¢\u0006\u0004\bU\u0010VJ\u0011\u0010X\u001a\u0006\u0012\u0002\b\u00030W¢\u0006\u0004\bX\u0010YJ\u0017\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\\\u0010\u000fJ\u000f\u0010]\u001a\u00020\u000bH\u0002¢\u0006\u0004\b]\u0010\u000fJ\u000f\u0010^\u001a\u00020\u000bH\u0002¢\u0006\u0004\b^\u0010\u000fJ\u0017\u0010a\u001a\u00020\u000b2\u0006\u0010`\u001a\u00020_H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010d\u001a\u00020\u000b2\u0006\u0010c\u001a\u00020\u0018H\u0002¢\u0006\u0004\bd\u0010\u001bJ\u0017\u0010f\u001a\u00020\u00102\u0006\u0010e\u001a\u00020\u0010H\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010j\u001a\u00020L2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020L2\u0006\u0010i\u001a\u00020hH\u0002¢\u0006\u0004\bl\u0010kJ\u0017\u0010n\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020LH\u0002¢\u0006\u0004\bn\u0010OJ\u0017\u0010o\u001a\u00020\u000b2\u0006\u0010m\u001a\u00020LH\u0002¢\u0006\u0004\bo\u0010OJ\u0017\u0010q\u001a\u00020\t2\u0006\u0010p\u001a\u00020\u0010H\u0002¢\u0006\u0004\bq\u0010rR\u0018\u0010t\u001a\u00060sR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010|\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u0018\u0010~\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0017\u0010\u0082\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020R8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0086\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0086\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0086\u0001R\u0017\u0010\u008a\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001d\u0010&\u001a\b\u0012\u0002\b\u0003\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u008c\u0001R\u0019\u0010M\u001a\u0004\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bM\u0010\u008d\u0001R\u0017\u0010\u0019\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0019\u0010\u008e\u0001R\u0019\u0010\u008f\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u008e\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u008b\u0001R\u0017\u0010\u0092\u0001\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u008b\u0001R\u0019\u0010\u0093\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u008e\u0001R\u0019\u0010\u0094\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u008e\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u008e\u0001R\u0019\u0010\u0096\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008b\u0001R\u0019\u0010\u0097\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u008b\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u008b\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u008b\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u008e\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u008e\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u008e\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008e\u0001R\u0017\u0010 \u0001\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010\u008e\u0001R \u0010¢\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010h0¡\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u008e\u0001R\u0019\u0010¥\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u008e\u0001R\u0019\u0010¦\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u008e\u0001R\u0019\u0010§\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u008e\u0001R\u0019\u0010¨\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010\u008e\u0001R\u0019\u0010©\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u008b\u0001R\u001a\u0010«\u0001\u001a\u00030ª\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u0017\u0010C\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u008e\u0001R\u0019\u0010\u00ad\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010\u0098\u0001R\u0019\u0010®\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010\u008e\u0001R\u0019\u0010¯\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u008e\u0001R\u0019\u0010°\u0001\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010\u008e\u0001R\u0019\u0010±\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010\u0098\u0001¨\u0006µ\u0001"}, d2 = {"Lru/yandex/taxi/widget/wheel/WheelView;", "Landroid/view/View;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setSafe", "Lzy11;", "setSafeLineSpacing", "(Z)V", "cancelFuture", "()V", "", "interval", "Ljava/lang/Runnable;", "runnable", "schedule", "(ILjava/lang/Runnable;)V", "cyclic", "setCyclic", "", "textSize", "setTextSize", "(F)V", "currentItem", "setCurrentItem", "(I)V", "byUser", "(IZ)V", "Lky41;", "wheelViewListener", "setListener", "(Lky41;)V", "Lwd11;", "adapter", "setAdapter", "(Lwd11;)V", "getAdapter", "()Lwd11;", "getCurrentItem", "()I", "block", "unblock", "isBlocked", "()Z", "onItemSelected", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "dispatchHoverEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "gainFocus", "direction", "Landroid/graphics/Rect;", "previouslyFocusedRect", "onFocusChanged", "(ZILandroid/graphics/Rect;)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "onTouchEvent", "isEnabled", BackendConfig.Restrictions.ENABLED, "setEnabled", "getItemsCount", "", "label", "setLabel", "(Ljava/lang/String;)V", "gravity", "setGravity", "Landroid/graphics/Paint;", "paint", "str", "getTextWidth", "(Landroid/graphics/Paint;Ljava/lang/String;)I", "Lvd11;", "getCurrentSubtree", "()Lvd11;", "initLoopView", "(Landroid/content/Context;)V", "initPaints", "remeasure", "measureTextWidthHeight", "Lru/yandex/taxi/widget/wheel/WheelView$Action;", "action", "smoothScroll", "(Lru/yandex/taxi/widget/wheel/WheelView$Action;)V", "velocityY", "scrollBy", "index", "getLoopMappingIndex", "(I)I", "", "item", "getContentTextWithMaxSymbols", "(Ljava/lang/Object;)Ljava/lang/String;", "getContentText", "content", "measuredCenterContentStart", "measuredOutContentStart", "pos", "isCentralElement", "(I)Z", "Liy41;", "wheelTouchHelper", "Liy41;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "listener", "Lky41;", "mFuture", "Ljava/lang/Runnable;", "paintOuterText", "Landroid/graphics/Paint;", "paintCenterText", "paintIndicator", "Landroid/graphics/RectF;", "selectedRect", "Landroid/graphics/RectF;", "virtualA11YSelectedValueRect", "virtualA11YPreviousRect", "virtualA11YNextRect", "selectedRectCornerRadius", "F", "Lwd11;", "Ljava/lang/String;", CA20Status.STATUS_USER_I, "maxTextWidth", "maxTextHeight", "itemHeight", "indicatorPadding", "textColorOut", "textColorCenter", "dividerColor", "lineSpacingMultiplier", "isCyclical", "Z", "firstLineY", "secondLineY", "centerY", "totalScrollY", "initPosition", "selectedItem", "preCurrentIndex", "itemsVisible", "", "visibles", "[Ljava/lang/Object;", "measuredHeight", "measuredWidth", "halfCircumference", "radius", "mOffset", "previousY", "", "startTime", "J", "blocked", "mGravity", "drawCenterContentStart", "drawOutContentStart", "lastChoiceByUser", "Companion", "jy41", "Action", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class WheelView extends View implements nwy0 {
    private static final int A11Y_NEXT_ITEM_ID = 2;
    private static final int A11Y_PREVIOUS_ITEM_ID = 0;
    private static final int A11Y_SELECTED_ITEM_ID = 1;
    private static final int A11Y_UNDEFINED_ITEM_ID = -1;
    private static final float CENTER_CONTENT_OFFSET = 6.0f;
    public static final jy41 Companion = new jy41();
    private static final String ELLIPSIS = "...";
    private static final String GET_PICKER_VIEW_TEXT = "getPickerViewText";
    private static final float LINE_SPACING_MULTIPLIER_DEFAULT = 3.0f;
    private static final float LINE_SPACING_MULTIPLIER_SAFE = 2.0f;
    private static final float SCALE_CONTENT = 1.0f;
    private static final String TAG = "WheelView";
    private static final int VELOCITY_FLING = 5;
    private wd11 adapter;
    private boolean blocked;
    private float centerY;
    private int dividerColor;
    private int drawCenterContentStart;
    private int drawOutContentStart;
    private float firstLineY;
    private GestureDetector gestureDetector;
    private int halfCircumference;
    private final Handler handler;
    private final float indicatorPadding;
    private int initPosition;
    private boolean isCyclical;
    private float itemHeight;
    private final int itemsVisible;
    private String label;
    private boolean lastChoiceByUser;
    private float lineSpacingMultiplier;
    private ky41 listener;
    private Runnable mFuture;
    private int mGravity;
    private int mOffset;
    private int maxTextHeight;
    private int maxTextWidth;
    private int measuredHeight;
    private int measuredWidth;
    private final Paint paintCenterText;
    private final Paint paintIndicator;
    private final Paint paintOuterText;
    private int preCurrentIndex;
    private float previousY;
    private int radius;
    private float secondLineY;
    private int selectedItem;
    private final RectF selectedRect;
    private final float selectedRectCornerRadius;
    private long startTime;
    private int textColorCenter;
    private int textColorOut;
    private int textSize;
    private int totalScrollY;
    private final RectF virtualA11YNextRect;
    private final RectF virtualA11YPreviousRect;
    private final RectF virtualA11YSelectedValueRect;
    private final Object[] visibles;
    private final iy41 wheelTouchHelper;
    private int widthMeasureSpec;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/widget/wheel/WheelView$Action;", "", "CLICK", "FLING", "DAGGLE", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Action {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action CLICK;
        public static final Action DAGGLE;
        public static final Action FLING;

        static {
            Action action = new Action("CLICK", 0);
            CLICK = action;
            Action action2 = new Action("FLING", 1);
            FLING = action2;
            Action action3 = new Action("DAGGLE", 2);
            DAGGLE = action3;
            Action[] actionArr = {action, action2, action3};
            $VALUES = actionArr;
            $ENTRIES = kotlin.enums.a.a(actionArr);
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.wheelTouchHelper = new iy41(this, this);
        this.handler = new Handler(Looper.getMainLooper());
        this.paintOuterText = new Paint();
        this.paintCenterText = new Paint();
        this.paintIndicator = new Paint();
        this.selectedRect = new RectF();
        this.virtualA11YSelectedValueRect = new RectF();
        this.virtualA11YPreviousRect = new RectF();
        this.virtualA11YNextRect = new RectF();
        this.selectedRectCornerRadius = tje.r(mrg0.wheel_view_corner_radius, getContext());
        this.lineSpacingMultiplier = 3.0f;
        this.mGravity = 17;
        this.textColorOut = qje.t(xng0.textMinor, getContext());
        this.textColorCenter = qje.t(xng0.textMain, getContext());
        this.dividerColor = qje.t(xng0.bgMinor, getContext());
        this.textSize = tje.r(mrg0.component_text_size_body, getContext());
        this.indicatorPadding = tje.r(mrg0.go_design_m_space, getContext());
        int i = 11;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c4i0.WheelView, 0, 0);
            try {
                this.mGravity = obtainStyledAttributes.getInt(c4i0.WheelView_gravity, 17);
                this.textColorOut = obtainStyledAttributes.getColor(c4i0.WheelView_textColorOut, this.textColorOut);
                this.textColorCenter = obtainStyledAttributes.getColor(c4i0.WheelView_textColorCenter, this.textColorCenter);
                this.dividerColor = obtainStyledAttributes.getColor(c4i0.WheelView_dividerColor, this.dividerColor);
                this.textSize = obtainStyledAttributes.getDimensionPixelOffset(c4i0.WheelView_wheelTextSize, this.textSize);
                this.isCyclical = obtainStyledAttributes.getBoolean(c4i0.WheelView_isCyclical, false);
                i = obtainStyledAttributes.getInt(c4i0.WheelView_itemsVisible, 11);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.itemsVisible = i;
        this.visibles = new Object[i];
        initLoopView(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getContentText(Object item) {
        String obj = item.toString();
        try {
            return item.getClass().getMethod(GET_PICKER_VIEW_TEXT, null).invoke(item, null).toString();
        } catch (Exception unused) {
            return obj;
        }
    }

    private final String getContentTextWithMaxSymbols(Object item) {
        String contentText = getContentText(item);
        Paint paint = this.paintCenterText;
        RectF rectF = this.selectedRect;
        int breakText = paint.breakText(contentText, true, rectF.right - rectF.left, null);
        return breakText < contentText.length() ? contentText.substring(0, breakText - 2).concat(ELLIPSIS) : contentText;
    }

    private final int getLoopMappingIndex(int index) {
        wd11 wd11Var = this.adapter;
        if (wd11Var != null) {
            if (index < 0) {
                return getLoopMappingIndex(wd11Var.a() + index);
            }
            if (index > wd11Var.a() - 1) {
                return getLoopMappingIndex(index - wd11Var.a());
            }
        }
        return index;
    }

    private final void initLoopView(Context context) {
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: ru.yandex.taxi.widget.wheel.WheelView$initLoopView$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                ky41 ky41Var;
                ky41Var = WheelView.this.listener;
                if (ky41Var != null) {
                    ky41Var.e();
                }
                WheelView.this.scrollBy(velocityY);
                return true;
            }
        });
        androidx.core.view.b.p(this, this.wheelTouchHelper);
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            gestureDetector = null;
        }
        gestureDetector.setIsLongpressEnabled(false);
        this.totalScrollY = 0;
        this.initPosition = -1;
        initPaints();
    }

    private final void initPaints() {
        this.paintOuterText.setColor(this.textColorOut);
        this.paintOuterText.setAntiAlias(true);
        this.paintOuterText.setTextSize(this.textSize);
        Paint paint = this.paintOuterText;
        int[] iArr = up11.a;
        paint.setTypeface(eja1.w(0, 0));
        this.paintCenterText.setColor(this.textColorCenter);
        this.paintCenterText.setAntiAlias(true);
        this.paintCenterText.setTextSize(this.textSize);
        this.paintCenterText.setTypeface(eja1.w(0, 0));
        this.paintIndicator.setColor(this.dividerColor);
        this.paintIndicator.setAntiAlias(true);
        setLayerType(1, null);
    }

    private final boolean isCentralElement(int pos) {
        return x4e.c(this.itemsVisible, 2, 2, 1) == pos;
    }

    private final void measureTextWidthHeight() {
        wd11 wd11Var = this.adapter;
        if (wd11Var == null) {
            return;
        }
        Rect rect = new Rect();
        int a = wd11Var.a();
        for (int i = 0; i < a; i++) {
            String contentText = getContentText(wd11Var.a.a(i));
            this.paintCenterText.getTextBounds(contentText, 0, contentText.length(), rect);
            int width = rect.width();
            if (width > this.maxTextWidth) {
                this.maxTextWidth = width;
            }
            this.paintCenterText.getTextBounds("星期", 0, 2, rect);
            int height = rect.height();
            if (height > this.maxTextHeight) {
                this.maxTextHeight = height;
            }
        }
        this.itemHeight = this.lineSpacingMultiplier * this.maxTextHeight;
    }

    private final void measuredCenterContentStart(String content) {
        Rect rect = new Rect();
        this.paintCenterText.getTextBounds(content, 0, content.length(), rect);
        int i = this.mGravity;
        if (i == 3) {
            this.drawCenterContentStart = 0;
        } else if (i == 5) {
            this.drawCenterContentStart = this.measuredWidth - rect.width();
        } else {
            if (i != 17) {
                return;
            }
            this.drawCenterContentStart = (int) ((this.measuredWidth - rect.width()) * 0.5d);
        }
    }

    private final void measuredOutContentStart(String content) {
        Rect rect = new Rect();
        this.paintOuterText.getTextBounds(content, 0, content.length(), rect);
        int i = this.mGravity;
        if (i == 3) {
            this.drawOutContentStart = 0;
        } else if (i == 5) {
            this.drawOutContentStart = this.measuredWidth - rect.width();
        } else {
            if (i != 17) {
                return;
            }
            this.drawOutContentStart = (int) ((this.measuredWidth - rect.width()) * 0.5d);
        }
    }

    private final void remeasure() {
        wd11 wd11Var = this.adapter;
        if (wd11Var == null) {
            return;
        }
        measureTextWidthHeight();
        int i = (int) (this.itemHeight * (this.itemsVisible - 1));
        this.halfCircumference = i;
        this.measuredHeight = (int) ((i * 2) / 3.141592653589793d);
        this.radius = (int) (i / 3.141592653589793d);
        this.measuredWidth = View.MeasureSpec.getSize(this.widthMeasureSpec);
        int i2 = this.measuredHeight;
        float f = this.itemHeight;
        this.firstLineY = (i2 - f) / 2.0f;
        this.secondLineY = (i2 + f) / 2.0f;
        this.centerY = ((i2 + this.maxTextHeight) / 2.0f) - 6.0f;
        if (this.initPosition == -1) {
            this.initPosition = this.isCyclical ? (wd11Var.a() + 1) / 2 : 0;
        }
        this.preCurrentIndex = this.initPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scrollBy(float velocityY) {
        schedule(5, new a(this, velocityY));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void smoothScroll(Action action) {
        if (action == Action.FLING || action == Action.DAGGLE) {
            float f = this.totalScrollY;
            float f2 = this.itemHeight;
            int i = (int) (((f % f2) + f2) % f2);
            this.mOffset = i;
            float f3 = i;
            if (f3 > f2 / 2.0f) {
                this.mOffset = (int) (f2 - f3);
            } else {
                this.mOffset = -i;
            }
        }
        schedule(10, new b(this));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    @Override // defpackage.nwy0
    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public final void block() {
        this.blocked = true;
    }

    public final void cancelFuture() {
        Runnable runnable = this.mFuture;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.mFuture = null;
        }
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent event) {
        return !this.wheelTouchHelper.c(event) && super.dispatchHoverEvent(event);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        return !this.wheelTouchHelper.d(event) && super.dispatchKeyEvent(event);
    }

    public final wd11 getAdapter() {
        return this.adapter;
    }

    /* renamed from: getCurrentItem, reason: from getter */
    public final int getSelectedItem() {
        return this.selectedItem;
    }

    public final vd11 getCurrentSubtree() {
        wd11 wd11Var = this.adapter;
        if (wd11Var != null) {
            return wd11Var.a.b(this.selectedItem);
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final int getItemsCount() {
        wd11 wd11Var = this.adapter;
        if (wd11Var != null) {
            return wd11Var.a();
        }
        return 0;
    }

    public final int getTextWidth(Paint paint, String str) {
        if (str == null || str.length() <= 0) {
            return 0;
        }
        int length = str.length();
        paint.getTextWidths(str, new float[length]);
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i += (int) Math.ceil(r1[i2]);
        }
        return i;
    }

    /* renamed from: isBlocked, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    @Override // android.view.View
    public boolean isEnabled() {
        return super.isEnabled();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        boolean z;
        wd11 wd11Var = this.adapter;
        if (wd11Var == null) {
            return;
        }
        vd11 vd11Var = wd11Var.a;
        try {
            this.preCurrentIndex = this.initPosition + (((int) (this.totalScrollY / this.itemHeight)) % wd11Var.a());
        } catch (ArithmeticException unused) {
            vby vbyVar = xby.d;
            String.format("%s %s", Arrays.copyOf(new Object[]{TAG, "Error adapter.getItemsCount() == 0"}, 2));
            vbyVar.getClass();
        }
        boolean z2 = this.isCyclical;
        int i = this.preCurrentIndex;
        boolean z3 = false;
        if (z2) {
            if (i < 0) {
                this.preCurrentIndex = wd11Var.a() + this.preCurrentIndex;
            }
            if (this.preCurrentIndex > wd11Var.a() - 1) {
                this.preCurrentIndex -= wd11Var.a();
            }
        } else {
            if (i < 0) {
                this.preCurrentIndex = 0;
            }
            if (this.preCurrentIndex > wd11Var.a() - 1) {
                this.preCurrentIndex = wd11Var.a() - 1;
            }
        }
        int i2 = (int) (this.totalScrollY % this.itemHeight);
        int i3 = 0;
        while (true) {
            int i4 = this.itemsVisible;
            if (i3 >= i4) {
                break;
            }
            int i5 = this.preCurrentIndex - ((i4 / 2) - i3);
            if (this.isCyclical) {
                this.visibles[i3] = vd11Var.a(getLoopMappingIndex(i5));
            } else if (i5 < 0) {
                this.visibles[i3] = "";
            } else {
                int a = wd11Var.a() - 1;
                Object[] objArr = this.visibles;
                if (i5 > a) {
                    objArr[i3] = "";
                } else {
                    objArr[i3] = vd11Var.a(i5);
                }
            }
            i3++;
        }
        int width = getWidth();
        int height = getHeight();
        float f2 = width;
        this.virtualA11YPreviousRect.set(0.0f, 0.0f, f2, this.firstLineY);
        this.virtualA11YNextRect.set(0.0f, this.secondLineY, f2, height);
        this.virtualA11YSelectedValueRect.set(0.0f, this.firstLineY, f2, this.secondLineY);
        RectF rectF = this.selectedRect;
        float f3 = this.indicatorPadding;
        rectF.set(f3, this.firstLineY, this.measuredWidth - f3, this.secondLineY);
        RectF rectF2 = this.selectedRect;
        float f4 = this.selectedRectCornerRadius;
        canvas.drawRoundRect(rectF2, f4, f4, this.paintIndicator);
        String str = this.label;
        float f5 = 6.0f;
        if (str != null) {
            canvas.drawText(str, (this.measuredWidth - getTextWidth(this.paintCenterText, str)) - 6.0f, this.centerY, this.paintCenterText);
        }
        int i6 = 0;
        while (i6 < this.itemsVisible) {
            canvas.save();
            float f6 = this.maxTextHeight * this.lineSpacingMultiplier;
            double d = (((i6 * f6) - i2) * 3.141592653589793d) / this.halfCircumference;
            float f7 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
            if (f7 >= 90.0f || f7 <= -90.0f) {
                f = f5;
                z = z3;
                canvas.restore();
            } else {
                Object obj = this.visibles[i6];
                String contentTextWithMaxSymbols = getContentTextWithMaxSymbols(obj == null ? "" : obj);
                measuredCenterContentStart(contentTextWithMaxSymbols);
                measuredOutContentStart(contentTextWithMaxSymbols);
                f = f5;
                float cos = (float) ((this.radius - (Math.cos(d) * this.radius)) - ((Math.sin(d) * this.maxTextHeight) / 2.0d));
                canvas.translate(0.0f, cos);
                canvas.scale(1.0f, (float) Math.sin(d));
                float f8 = this.firstLineY;
                if (cos > f8 || this.maxTextHeight + cos < f8) {
                    float f9 = this.secondLineY;
                    if (cos <= f9 && this.maxTextHeight + cos >= f9) {
                        canvas.save();
                        canvas.clipRect(0, 0, this.measuredWidth, (int) (this.secondLineY - cos));
                        canvas.scale(1.0f, (float) Math.sin(d));
                        canvas.drawText(contentTextWithMaxSymbols, this.drawCenterContentStart, this.maxTextHeight - f, this.paintCenterText);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0, (int) (this.secondLineY - cos), this.measuredWidth, (int) f6);
                        canvas.scale(1.0f, (float) (Math.sin(d) * 1.0d));
                        canvas.drawText(contentTextWithMaxSymbols, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                    } else if (cos < f8 || this.maxTextHeight + cos > f9) {
                        canvas.save();
                        z = false;
                        canvas.clipRect(0, 0, this.measuredWidth, (int) f6);
                        canvas.scale(1.0f, (float) (Math.sin(d) * 1.0d));
                        canvas.drawText(contentTextWithMaxSymbols, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                        canvas.restore();
                        canvas.restore();
                    } else {
                        canvas.clipRect(0, 0, this.measuredWidth, (int) f6);
                        canvas.drawText(contentTextWithMaxSymbols, this.drawCenterContentStart, this.maxTextHeight - f, this.paintCenterText);
                        int b = wd11Var.b(obj);
                        if (b != -1) {
                            this.selectedItem = b;
                        }
                    }
                } else {
                    canvas.save();
                    canvas.clipRect(0, 0, this.measuredWidth, (int) (this.firstLineY - cos));
                    canvas.scale(1.0f, (float) (Math.sin(d) * 1.0d));
                    canvas.drawText(contentTextWithMaxSymbols, this.drawOutContentStart, this.maxTextHeight, this.paintOuterText);
                    canvas.restore();
                    canvas.save();
                    canvas.clipRect(0, (int) (this.firstLineY - cos), this.measuredWidth, (int) f6);
                    canvas.scale(1.0f, (float) Math.sin(d));
                    canvas.drawText(contentTextWithMaxSymbols, this.drawCenterContentStart, this.maxTextHeight - f, this.paintCenterText);
                    canvas.restore();
                }
                z = false;
                canvas.restore();
            }
            i6++;
            z3 = z;
            f5 = f;
        }
        Arrays.fill(this.visibles, (Object) null);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean gainFocus, int direction, Rect previouslyFocusedRect) {
        super.onFocusChanged(gainFocus, direction, previouslyFocusedRect);
        this.wheelTouchHelper.j(gainFocus, direction, previouslyFocusedRect);
    }

    public final void onItemSelected() {
        ky41 ky41Var = this.listener;
        if (ky41Var != null) {
            ky41Var.i();
            ky41Var.g(this.selectedItem, this.lastChoiceByUser);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.widthMeasureSpec = widthMeasureSpec;
        remeasure();
        setMeasuredDimension(this.measuredWidth, this.measuredHeight);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!isEnabled() || getBlocked()) {
            return false;
        }
        GestureDetector gestureDetector = this.gestureDetector;
        if (gestureDetector == null) {
            gestureDetector = null;
        }
        boolean onTouchEvent = gestureDetector.onTouchEvent(event);
        int action = event.getAction();
        if (action == 0) {
            this.startTime = System.currentTimeMillis();
            cancelFuture();
            this.previousY = event.getRawY();
            ky41 ky41Var = this.listener;
            if (ky41Var != null) {
                ky41Var.e();
            }
        } else if (action == 1) {
            this.lastChoiceByUser = true;
            if (!onTouchEvent) {
                float y = event.getY();
                int i = this.radius;
                float acos = (float) (Math.acos((i - y) / i) * this.radius);
                float f = this.itemHeight;
                int i2 = (int) (((f / 2.0f) + acos) / f);
                this.mOffset = (int) (((i2 - (this.itemsVisible / 2)) * f) - (((this.totalScrollY % f) + f) % f));
                if (System.currentTimeMillis() - this.startTime > 120) {
                    smoothScroll(Action.DAGGLE);
                } else {
                    if (!isCentralElement(i2) && this.mOffset < 10) {
                        this.mOffset = (int) ((i2 - (this.itemsVisible / 2)) * this.itemHeight);
                    }
                    smoothScroll(Action.CLICK);
                }
            }
        } else if (action == 2) {
            float rawY = this.previousY - event.getRawY();
            this.previousY = event.getRawY();
            this.totalScrollY = (int) (this.totalScrollY + rawY);
            if (!this.isCyclical) {
                float f2 = (-this.initPosition) * this.itemHeight;
                float a = (this.adapter != null ? (r0.a() - 1) - this.initPosition : 0) * this.itemHeight;
                int i3 = this.totalScrollY;
                if (i3 < f2) {
                    this.totalScrollY = (int) f2;
                } else if (i3 > a) {
                    this.totalScrollY = (int) a;
                }
            }
        } else if (!onTouchEvent) {
            float y2 = event.getY();
            int i4 = this.radius;
            float acos2 = (float) (Math.acos((i4 - y2) / i4) * this.radius);
            float f3 = this.itemHeight;
            int i5 = (int) (((f3 / 2.0f) + acos2) / f3);
            this.mOffset = (int) (((i5 - (this.itemsVisible / 2)) * f3) - (((this.totalScrollY % f3) + f3) % f3));
            if (System.currentTimeMillis() - this.startTime > 120) {
                smoothScroll(Action.DAGGLE);
            } else {
                if (!isCentralElement(i5) && this.mOffset < 10) {
                    this.mOffset = (int) ((i5 - (this.itemsVisible / 2)) * this.itemHeight);
                }
                smoothScroll(Action.CLICK);
            }
        }
        invalidate();
        return true;
    }

    public final void schedule(int interval, Runnable runnable) {
        cancelFuture();
        xz xzVar = new xz(this, interval, runnable);
        this.mFuture = xzVar;
        this.handler.post(xzVar);
    }

    public final void setAdapter(wd11 adapter) {
        this.adapter = adapter;
        remeasure();
        invalidate();
        sendAccessibilityEvent(SelfTester_JCP.ENCRYPT_CBC);
    }

    public final void setCurrentItem(int currentItem, boolean byUser) {
        this.lastChoiceByUser = byUser;
        this.initPosition = currentItem;
        this.selectedItem = currentItem;
        this.totalScrollY = 0;
        invalidate();
        sendAccessibilityEvent(SelfTester_JCP.ENCRYPT_CBC);
        wd11 wd11Var = this.adapter;
        if (wd11Var == null || wd11Var.a() <= 0 || this.selectedItem >= wd11Var.a()) {
            return;
        }
        announceForAccessibility(getResources().getString(mzh0.wheel_picker_select_new_item_announcement_postfix, getContentText(wd11Var.a.a(this.selectedItem))));
    }

    public final void setCyclic(boolean cyclic) {
        this.isCyclical = cyclic;
    }

    @Override // android.view.View
    public void setEnabled(boolean enabled) {
        if (enabled != isEnabled()) {
            super.setEnabled(enabled);
            this.paintCenterText.setColor(enabled ? this.textColorCenter : this.textColorOut);
        }
    }

    public final void setGravity(int gravity) {
        this.mGravity = gravity;
    }

    public final void setLabel(String label) {
        this.label = label;
    }

    public final void setListener(ky41 wheelViewListener) {
        this.listener = wheelViewListener;
    }

    public final void setSafeLineSpacing(boolean setSafe) {
        this.lineSpacingMultiplier = setSafe ? 2.0f : 3.0f;
        remeasure();
        requestLayout();
    }

    public final void setTextSize(float textSize) {
        this.paintOuterText.setTextSize(textSize);
        this.paintCenterText.setTextSize(textSize);
    }

    public final void unblock() {
        this.blocked = false;
    }

    public final void setCurrentItem(int currentItem) {
        setCurrentItem(currentItem, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WheelView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ WheelView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
