package ru.yandex.taxi.design;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.interpolator.view.animation.FastOutLinearInInterpolator;
import defpackage.c4i0;
import defpackage.cma1;
import defpackage.d82;
import defpackage.dai;
import defpackage.g18;
import defpackage.j63;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.ndh0;
import defpackage.nj60;
import defpackage.nwy0;
import defpackage.oj60;
import defpackage.oyr;
import defpackage.qj60;
import defpackage.rj60;
import defpackage.rp31;
import defpackage.sf30;
import defpackage.sj60;
import defpackage.sph0;
import defpackage.ssu;
import defpackage.t1w;
import defpackage.t37;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tls;
import defpackage.ub60;
import defpackage.weu;
import defpackage.x43;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xq31;
import defpackage.xw31;
import defpackage.ycc;
import defpackage.yd2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.NotificationsScrollView;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 Ý\u00012\u00020\u00012\u00020\u0002:\rÞ\u0001ß\u0001®\u0001à\u0001á\u0001â\u0001-B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0017\u0010\u0016J\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\rJ\r\u0010\u001a\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\rJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\rJ\u0019\u0010\u001e\u001a\u00020\u000b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\u000b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b \u0010#J\u001b\u0010$\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u000b2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000b¢\u0006\u0004\b,\u0010\rJ\u0015\u0010/\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b1\u00100J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000bH\u0002¢\u0006\u0004\b4\u0010\rJ\u001d\u00105\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b5\u00106J\u001d\u00107\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b7\u00106J#\u00109\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\n\u00108\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u000fH\u0002¢\u0006\u0004\b?\u0010+J\u001f\u0010B\u001a\u00020\u000b2\u0006\u0010@\u001a\u00020;2\u0006\u0010A\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020\u000b2\u0006\u0010D\u001a\u00020;2\u0006\u0010E\u001a\u00020;H\u0002¢\u0006\u0004\bF\u0010CJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020;H\u0002¢\u0006\u0004\bF\u0010HJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010O\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000b2\u0006\u0010N\u001a\u00020MH\u0002¢\u0006\u0004\bQ\u0010PJ3\u0010U\u001a\u00020\u000b2\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000fH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010X\u001a\u00020\u000b2\f\u0010N\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c2\u0006\u0010W\u001a\u00020\u000fH\u0002¢\u0006\u0004\bX\u0010YJ\u001b\u0010Z\u001a\u00020\u000b2\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\bZ\u0010\u001fJ!\u0010^\u001a\u0004\u0018\u00010]2\u0006\u0010N\u001a\u00020M2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b^\u0010_J)\u0010`\u001a\u0004\u0018\u00010]2\u0006\u0010N\u001a\u00020M2\u0006\u0010R\u001a\u00020\u000f2\u0006\u0010\\\u001a\u00020[H\u0002¢\u0006\u0004\b`\u0010aJ\u0017\u0010c\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u0013H\u0002¢\u0006\u0004\bc\u0010\u0016J\u0017\u0010d\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bd\u0010\u0016J\u001f\u0010e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020M2\u0006\u0010b\u001a\u00020\u0013H\u0002¢\u0006\u0004\be\u0010fJ\u0019\u0010i\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010k\u001a\u00020\u000b2\b\u0010h\u001a\u0004\u0018\u00010gH\u0002¢\u0006\u0004\bk\u0010jJ\u000f\u0010l\u001a\u00020\u000bH\u0002¢\u0006\u0004\bl\u0010\rJ\u000f\u0010m\u001a\u00020\u000bH\u0002¢\u0006\u0004\bm\u0010\rJ\u000f\u0010n\u001a\u00020\u000bH\u0002¢\u0006\u0004\bn\u0010\rJ)\u0010q\u001a\b\u0012\u0004\u0012\u00020!0p2\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0&H\u0002¢\u0006\u0004\bq\u0010rJ\u001b\u0010s\u001a\u00020\u000b2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\bs\u0010\u001fJ\u0017\u0010u\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020;H\u0002¢\u0006\u0004\bu\u0010HJ\u0017\u0010v\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020MH\u0002¢\u0006\u0004\bv\u0010PJ\u001b\u0010w\u001a\u00020\u00072\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u000fH\u0002¢\u0006\u0004\by\u0010+J\u000f\u0010z\u001a\u00020\u000fH\u0002¢\u0006\u0004\bz\u0010+J\u000f\u0010{\u001a\u00020\u000fH\u0002¢\u0006\u0004\b{\u0010+J\u000f\u0010|\u001a\u00020\u000fH\u0002¢\u0006\u0004\b|\u0010+J\u001b\u0010}\u001a\u00020\u000b2\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b}\u0010\u001fJ \u0010 \u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020[H\u0002¢\u0006\u0005\b \u0010\u0080\u0001J\u001b\u0010\u0082\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0084\u0001\u0010\rJ\u0011\u0010\u0085\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0085\u0001\u0010\rJ\u0019\u0010\u0086\u0001\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020MH\u0002¢\u0006\u0005\b\u0086\u0001\u0010PJ\u0011\u0010\u0087\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\rJ\u0011\u0010\u0088\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0088\u0001\u0010\rJ\u0011\u0010\u0089\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0089\u0001\u0010\rJ\u001e\u0010\u008b\u0001\u001a\u00020\u000b2\u000b\u0010\u008a\u0001\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0005\b\u008b\u0001\u0010\u001fJ\u0011\u0010\u008c\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008c\u0001\u0010\rJ\u0011\u0010\u008d\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008d\u0001\u0010\rJ\u0011\u0010\u008e\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u008e\u0001\u0010\rJ(\u0010\u0091\u0001\u001a\u00020\u000b2\n\u0010N\u001a\u0006\u0012\u0002\b\u00030\u001c2\b\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0093\u0001\u0010\rJ\u0011\u0010\u0094\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0094\u0001\u0010+R\u0017\u0010\u0095\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0017\u0010\u0097\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0096\u0001R\u0017\u0010\u0098\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0096\u0001R\u0017\u0010\u0099\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0096\u0001R\u0017\u0010\u009a\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0096\u0001R\u0017\u0010\u009b\u0001\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0096\u0001R\u0017\u0010\u009c\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0017\u0010\u009e\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001R\u0017\u0010\u009f\u0001\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u009d\u0001R\u0019\u0010 \u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010\u0096\u0001R\u0019\u0010¡\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¡\u0001\u0010\u0096\u0001R\u0018\u0010£\u0001\u001a\u00030¢\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R\u0017\u0010¥\u0001\u001a\u00020~8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010¦\u0001R\u0018\u0010¨\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010«\u0001\u001a\u00030ª\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001f\u0010¯\u0001\u001a\n\u0012\u0005\u0012\u00030®\u00010\u00ad\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0001\u0010°\u0001R)\u0010²\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b²\u0001\u0010³\u0001\u001a\u0005\b²\u0001\u0010+R\u0019\u0010´\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010³\u0001R\u0019\u0010µ\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010³\u0001R)\u0010¶\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\b¶\u0001\u0010³\u0001\u001a\u0005\b¶\u0001\u0010+R\"\u0010¸\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R\"\u0010»\u0001\u001a\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001c0º\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u001f\u0010½\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0019\u0010¿\u0001\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010Á\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010³\u0001R\u0019\u0010Â\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0001\u0010³\u0001R\u0019\u0010Ã\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010³\u0001R\u0019\u0010Ä\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010\u009d\u0001R\u0017\u0010@\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b@\u0010\u009d\u0001R\u0019\u0010Å\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010\u009d\u0001R\u0019\u0010Æ\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010\u009d\u0001R\u001b\u0010Ç\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010È\u0001R\u0019\u0010Ê\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010³\u0001R\u0019\u0010Ë\u0001\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010\u009d\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ï\u0001\u001a\u00030Î\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Ò\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u001a\u0010Ô\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Ó\u0001R\u001a\u0010Õ\u0001\u001a\u00030Ñ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ó\u0001R\u001e\u0010Ö\u0001\u001a\t\u0012\u0004\u0012\u00020-0·\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÖ\u0001\u0010¹\u0001R\u001a\u0010Ù\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001c8F¢\u0006\b\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0017\u0010Ü\u0001\u001a\u00020;8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÚ\u0001\u0010Û\u0001¨\u0006ã\u0001"}, d2 = {"Lru/yandex/taxi/design/NotificationStackComponent;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "onAttachedToWindow", "()V", "onDetachedFromWindow", "", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "closeList", "expandList", "hide", "show", "Lru/yandex/taxi/design/NotificationItemComponent;", "item", "showNotification", "(Lru/yandex/taxi/design/NotificationItemComponent;)V", "closeNotification", "", "notificationId", "(Ljava/lang/String;)V", "getNotification", "(Ljava/lang/String;)Lru/yandex/taxi/design/NotificationItemComponent;", "Lkotlin/Function1;", "notificationIdPredicate", "closeNotifications", "(Ltls;)V", "onBackPressed", "()Z", "dropOffset", "Lsj60;", "listener", "addListener", "(Lsj60;)V", "removeListener", "captureView", "(Landroid/view/MotionEvent;)V", "resetCapturedViewAndDraggingState", "tryCaptureTopItem", "(Landroid/view/MotionEvent;)Lru/yandex/taxi/design/NotificationItemComponent;", "tryCaptureAnyItem", "focusedView", "updateOrCaptureView", "(Landroid/view/MotionEvent;Lru/yandex/taxi/design/NotificationItemComponent;)V", "", "deltaY", "inspectAllowableBottomPosition", "(F)F", "isCaptured", "capturedViewStartY", "currentY", "updateActualItemsVerticallyPositions", "(FF)V", "startX", "currentX", "updateActualItemsHorizontallyPositions", "factor", "(F)V", "Landroid/animation/Animator;", "animator", "onMoveInAnimationEnd", "(Landroid/animation/Animator;)V", "Landroid/view/View;", "view", "moveItemToCanonicalPositionX", "(Landroid/view/View;)V", "moveItemToCanonicalPositionY", "moveOutToLeft", "moveOutToRight", "moveOutToTop", "moveItemOutOfScreen", "(Lru/yandex/taxi/design/NotificationItemComponent;ZZZ)V", "removedManually", "finishRemovingItem", "(Lru/yandex/taxi/design/NotificationItemComponent;Z)V", "removeNotification", "Landroid/animation/Animator$AnimatorListener;", "onEnd", "Landroid/animation/ValueAnimator;", "getItemOutOfScreenVerticallyAnimator", "(Landroid/view/View;Landroid/animation/Animator$AnimatorListener;)Landroid/animation/ValueAnimator;", "getItemOutOfScreenHorizontallyAnimator", "(Landroid/view/View;ZLandroid/animation/Animator$AnimatorListener;)Landroid/animation/ValueAnimator;", "ev", "isTopItemTarget", "isAnyItemTarget", "isInsideItem", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "Ljava/lang/Runnable;", "onAnimationEndRunnable", "closeListInternal", "(Ljava/lang/Runnable;)V", "moveToStackedState", "moveToExpandState", "hideInternal", "showInternal", "predicate", "", "findNotificationIds", "(Ltls;)Ljava/util/Set;", "addItemInternal", "height", "setAllItemsHeight", "measureExpandedItem", "findNewItemIndex", "(Lru/yandex/taxi/design/NotificationItemComponent;)I", "isAnimatingOrDragging", "isRemovingItems", "canAddItem", "canRemoveItem", "removeItemInternal", "Landroid/view/ViewGroup;", "onComplete", "(Landroid/view/ViewGroup;Landroid/animation/Animator$AnimatorListener;)V", "index", "addItemToStackedList", "(I)V", "subscribeToTopItemLayoutChanges", "hideInvisibleItems", "prepareNextItem", "updateZ", "onExpanded", "notifyNotificationsShownInFront", "notification", "notifyNotificationShownInFront", "notifyExpandStateChanged", "onStacked", "clearState", "Lru/yandex/taxi/design/NotificationStackComponent$UpdateOperation;", "op", "addUpdate", "(Lru/yandex/taxi/design/NotificationItemComponent;Lru/yandex/taxi/design/NotificationStackComponent$UpdateOperation;)V", "checkUpdateQueue", "checkUpdateQueueOnce", "listTopMargin", CA20Status.STATUS_USER_I, "leftMargin", "rightMargin", "minFlingVelocity", "minFlingDistance", "topItemZ", "horizontalIndent", "F", "topIndent", "listSpacing", "statusBarHeight", "windowHeight", "Lru/yandex/taxi/widget/NotificationsScrollView;", "scrollView", "Lru/yandex/taxi/widget/NotificationsScrollView;", "itemsContainer", "Landroid/view/ViewGroup;", "Lru/yandex/taxi/design/ListItemComponent;", "collapseButton", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/view/GestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "Lx43;", "Lru/yandex/taxi/design/m;", "updateQueue", "Lx43;", "value", "isExpanded", "Z", "isDraggedHorizontally", "isDraggedVertically", "isHidden", "", "notifications", "Ljava/util/List;", "", "removingItems", "Ljava/util/Set;", "capturedView", "Lru/yandex/taxi/design/NotificationItemComponent;", "cancelAnimationTask", "Ljava/lang/Runnable;", "isMovingToExpandState", "isMovingToStackedState", "ignoreTouchEvents", "capturedViewStartX", "startTouchX", "startTouchY", "moveOutAnimator", "Landroid/animation/ValueAnimator;", "moveInAnimator", "isAddingItem", "allItemsHeight", "lastTopItem", "Landroid/view/View;", "Landroid/view/View$OnLayoutChangeListener;", "topItemLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "Lg18;", "onPreDrawCancellable", "Lg18;", "showCancellable", "autoPaddingsCancellable", "listeners", "getTopNotificationItem", "()Lru/yandex/taxi/design/NotificationItemComponent;", "topNotificationItem", "getScaledTouchSlop", "()F", "scaledTouchSlop", "Companion", "rj60", "TopItemOnLayoutChangeListener", "UpdateOperation", "NotificationGestureListener", "GestureListener", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NotificationStackComponent extends FrameLayout implements nwy0 {
    private static final long APPEAR_ANIM_DURATION = 300;
    private static final long BELOW_TRANSFORMATION_DELAY = 100;
    private static final long BELOW_TRANSFORMATION_DURATION = 200;
    public static final rj60 Companion = new rj60();
    private static final int DIRECTION_DOWN = 1;
    public static final int ITEM_COLLAPSED_DURATION = 250;
    private static final long LIST_EXPANDED_DURATION = 300;
    private static final int MAX_VISIBLE_ITEMS = 3;
    private static final long MOVE_OUT_DURATION = 300;
    private static final int STANDARD_TRANSITION_DURATION = 200;
    private float allItemsHeight;
    private g18 autoPaddingsCancellable;
    private Runnable cancelAnimationTask;
    private NotificationItemComponent<?> capturedView;
    private float capturedViewStartX;
    private float capturedViewStartY;
    private final ListItemComponent collapseButton;
    private final GestureDetector gestureDetector;
    private final float horizontalIndent;
    private boolean ignoreTouchEvents;
    private boolean isAddingItem;
    private boolean isDraggedHorizontally;
    private boolean isDraggedVertically;
    private boolean isExpanded;
    private boolean isHidden;
    private boolean isMovingToExpandState;
    private boolean isMovingToStackedState;
    private final ViewGroup itemsContainer;
    private View lastTopItem;
    private final int leftMargin;
    private final float listSpacing;
    private final int listTopMargin;
    private final List<sj60> listeners;
    private final int minFlingDistance;
    private final int minFlingVelocity;
    private ValueAnimator moveInAnimator;
    private ValueAnimator moveOutAnimator;
    private final List<NotificationItemComponent<?>> notifications;
    private g18 onPreDrawCancellable;
    private final Set<NotificationItemComponent<?>> removingItems;
    private final int rightMargin;
    private final NotificationsScrollView scrollView;
    private g18 showCancellable;
    private float startTouchX;
    private float startTouchY;
    private int statusBarHeight;
    private final float topIndent;
    private final View.OnLayoutChangeListener topItemLayoutChangeListener;
    private final int topItemZ;
    private final x43 updateQueue;
    private int windowHeight;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\b¢\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J*\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000e\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0007H\u0016¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/design/NotificationStackComponent$GestureListener;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "(Lru/yandex/taxi/design/NotificationStackComponent;)V", "onSingleTapUp", "", "e", "Landroid/view/MotionEvent;", "onFling", "e1", "e2", "velocityX", "", "velocityY", "onHorizontalFling", "onVerticalFling", "onSwipeRight", "onSwipeLeft", "onSwipeTop", "onSwipeBottom", "onSingleTap", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public abstract class GestureListener extends GestureDetector.SimpleOnGestureListener {
        public GestureListener() {
        }

        private final boolean onHorizontalFling(MotionEvent e1, MotionEvent e2, float velocityX) {
            if (Math.abs(velocityX) < NotificationStackComponent.this.minFlingVelocity) {
                return false;
            }
            if (e1.getX() - e2.getX() > NotificationStackComponent.this.minFlingDistance) {
                return onSwipeLeft(e1, e2);
            }
            if (e2.getX() - e1.getX() > NotificationStackComponent.this.minFlingDistance) {
                return onSwipeRight(e1, e2);
            }
            return false;
        }

        private final boolean onVerticalFling(MotionEvent e1, MotionEvent e2, float velocityY) {
            if (Math.abs(velocityY) < NotificationStackComponent.this.minFlingVelocity) {
                return false;
            }
            if (e1.getY() - e2.getY() > NotificationStackComponent.this.minFlingDistance) {
                return onSwipeTop(e1, e2);
            }
            if (e2.getY() - e1.getY() > NotificationStackComponent.this.minFlingDistance) {
                return onSwipeBottom(e1, e2);
            }
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e1 == null) {
                return false;
            }
            return Math.abs(e1.getX() - e2.getX()) > Math.abs(e1.getY() - e2.getY()) ? onHorizontalFling(e1, e2, velocityX) : onVerticalFling(e1, e2, velocityY);
        }

        public boolean onSingleTap(MotionEvent event) {
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e) {
            return onSingleTap(e);
        }

        public boolean onSwipeBottom(MotionEvent e1, MotionEvent e2) {
            return false;
        }

        public boolean onSwipeLeft(MotionEvent e1, MotionEvent e2) {
            return false;
        }

        public boolean onSwipeRight(MotionEvent e1, MotionEvent e2) {
            return false;
        }

        public boolean onSwipeTop(MotionEvent e1, MotionEvent e2) {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lru/yandex/taxi/design/NotificationStackComponent$NotificationGestureListener;", "Lru/yandex/taxi/design/NotificationStackComponent$GestureListener;", "Lru/yandex/taxi/design/NotificationStackComponent;", "<init>", "(Lru/yandex/taxi/design/NotificationStackComponent;)V", "onSingleTapUp", "", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Landroid/view/MotionEvent;", "onSwipeBottom", "e1", "e2", "onSwipeTop", "downEvent", "upEvent", "onSwipeRight", "onSwipeLeft", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class NotificationGestureListener extends GestureListener {
        public NotificationGestureListener() {
            super();
        }

        @Override // ru.yandex.taxi.design.NotificationStackComponent.GestureListener, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent event) {
            if (NotificationStackComponent.this.notifications.size() > 1 && !NotificationStackComponent.this.getIsExpanded() && NotificationStackComponent.this.isTopItemTarget(event)) {
                NotificationStackComponent.this.expandList();
                return true;
            }
            if (NotificationStackComponent.this.getIsExpanded() && NotificationStackComponent.this.isAnyItemTarget(event)) {
                return false;
            }
            if (!NotificationStackComponent.this.getIsExpanded() && NotificationStackComponent.this.isTopItemTarget(event)) {
                return false;
            }
            NotificationStackComponent.this.closeList();
            return true;
        }

        @Override // ru.yandex.taxi.design.NotificationStackComponent.GestureListener
        public boolean onSwipeBottom(MotionEvent e1, MotionEvent e2) {
            if (NotificationStackComponent.this.getIsExpanded() || NotificationStackComponent.this.isDraggedHorizontally || NotificationStackComponent.this.notifications.size() <= 1) {
                return false;
            }
            NotificationStackComponent.this.expandList();
            return true;
        }

        @Override // ru.yandex.taxi.design.NotificationStackComponent.GestureListener
        public boolean onSwipeLeft(MotionEvent downEvent, MotionEvent upEvent) {
            NotificationItemComponent notificationItemComponent;
            if (NotificationStackComponent.this.isDraggedVertically || (notificationItemComponent = NotificationStackComponent.this.capturedView) == null || !notificationItemComponent.getIsDismissible()) {
                return false;
            }
            NotificationStackComponent.this.moveItemOutOfScreen(notificationItemComponent, true, false, false);
            return true;
        }

        @Override // ru.yandex.taxi.design.NotificationStackComponent.GestureListener
        public boolean onSwipeRight(MotionEvent downEvent, MotionEvent upEvent) {
            NotificationItemComponent notificationItemComponent;
            if (NotificationStackComponent.this.isDraggedVertically || (notificationItemComponent = NotificationStackComponent.this.capturedView) == null || !notificationItemComponent.getIsDismissible()) {
                return false;
            }
            NotificationStackComponent.this.moveItemOutOfScreen(notificationItemComponent, false, true, false);
            return true;
        }

        @Override // ru.yandex.taxi.design.NotificationStackComponent.GestureListener
        public boolean onSwipeTop(MotionEvent downEvent, MotionEvent upEvent) {
            if (NotificationStackComponent.this.isDraggedHorizontally) {
                return false;
            }
            boolean isExpanded = NotificationStackComponent.this.getIsExpanded();
            NotificationStackComponent notificationStackComponent = NotificationStackComponent.this;
            if (isExpanded) {
                if (notificationStackComponent.scrollView.canScrollVertically(1)) {
                    return false;
                }
                NotificationStackComponent.this.closeList();
                return true;
            }
            NotificationItemComponent tryCaptureTopItem = notificationStackComponent.tryCaptureTopItem(downEvent);
            if (tryCaptureTopItem == null || !tryCaptureTopItem.getIsDismissible()) {
                return false;
            }
            NotificationStackComponent.this.moveItemOutOfScreen(tryCaptureTopItem, false, false, true);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/design/NotificationStackComponent$TopItemOnLayoutChangeListener;", "Landroid/view/View$OnLayoutChangeListener;", "<init>", "(Lru/yandex/taxi/design/NotificationStackComponent;)V", "Landroid/view/View;", "v", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public final class TopItemOnLayoutChangeListener implements View.OnLayoutChangeListener {
        public TopItemOnLayoutChangeListener() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View v, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
            if (NotificationStackComponent.this.isAddingItem || NotificationStackComponent.this.isMovingToStackedState || NotificationStackComponent.this.getIsExpanded() || bottom - top == oldBottom - oldTop) {
                return;
            }
            NotificationStackComponent.this.moveToStackedState(null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/NotificationStackComponent$UpdateOperation;", "", "REMOVE", "ADD", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class UpdateOperation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ UpdateOperation[] $VALUES;
        public static final UpdateOperation ADD;
        public static final UpdateOperation REMOVE;

        static {
            UpdateOperation updateOperation = new UpdateOperation("REMOVE", 0);
            REMOVE = updateOperation;
            UpdateOperation updateOperation2 = new UpdateOperation("ADD", 1);
            ADD = updateOperation2;
            UpdateOperation[] updateOperationArr = {updateOperation, updateOperation2};
            $VALUES = updateOperationArr;
            $ENTRIES = kotlin.enums.a.a(updateOperationArr);
        }

        public static UpdateOperation valueOf(String str) {
            return (UpdateOperation) Enum.valueOf(UpdateOperation.class, str);
        }

        public static UpdateOperation[] values() {
            return (UpdateOperation[]) $VALUES.clone();
        }
    }

    public NotificationStackComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ru.yandex.taxi.design.utils.c.q(this, sph0.component_notification_stack, true);
        this.listTopMargin = tje.r(mrg0.go_design_s_space, getContext());
        this.leftMargin = tje.r(mrg0.go_design_s_space, getContext());
        this.rightMargin = tje.r(mrg0.go_design_s_space, getContext());
        this.minFlingVelocity = tje.r(mrg0.component_notification_min_fling_velocity, getContext());
        this.minFlingDistance = tje.r(mrg0.component_notification_min_fling_distance, getContext());
        this.topItemZ = tje.r(mrg0.go_design_s_space, getContext());
        this.horizontalIndent = tje.r(mrg0.go_design_s_space, getContext());
        this.topIndent = tje.r(mrg0.go_design_s_space, getContext());
        this.listSpacing = tje.r(mrg0.go_design_s_space, getContext());
        this.windowHeight = getHeight();
        int i2 = ndh0.notifications_scroll_view;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        this.scrollView = (NotificationsScrollView) ((View) rp31.d(this, i2));
        this.itemsContainer = (ViewGroup) ((View) rp31.d(this, ndh0.notifications_items_container));
        ListItemComponent listItemComponent = (ListItemComponent) ((View) rp31.d(this, ndh0.notifications_collapse_button));
        this.collapseButton = listItemComponent;
        this.updateQueue = new x43();
        this.notifications = new ArrayList();
        this.removingItems = new HashSet();
        this.cancelAnimationTask = new d82(4);
        this.topItemLayoutChangeListener = new TopItemOnLayoutChangeListener();
        dai daiVar = g18.u1;
        this.onPreDrawCancellable = daiVar;
        this.showCancellable = daiVar;
        this.autoPaddingsCancellable = daiVar;
        this.listeners = new CopyOnWriteArrayList();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, c4i0.NotificationStackComponent, i, 0);
        try {
            listItemComponent.setTitle(obtainStyledAttributes.getString(c4i0.NotificationStackComponent_collapse_button_text));
            obtainStyledAttributes.recycle();
            listItemComponent.setVisibility(4);
            listItemComponent.setOnClickListener(new t37(3, this));
            setAllItemsHeight(xw31.u());
            this.gestureDetector = new GestureDetector(getContext(), new NotificationGestureListener());
            setMotionEventSplittingEnabled(false);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private final void addItemInternal(NotificationItemComponent<?> item) {
        if (getNotification(item.getNotificationId()) != null) {
            return;
        }
        int findNewItemIndex = findNewItemIndex(item);
        item.onAttachNotification();
        this.itemsContainer.addView(item);
        this.notifications.add(findNewItemIndex, item);
        subscribeToTopItemLayoutChanges();
        prepareNextItem(item);
        updateZ();
        measureExpandedItem(item);
        item.setY(((-item.getMeasuredHeight()) - this.topIndent) - this.statusBarHeight);
        if (this.isExpanded) {
            moveToExpandState();
        } else {
            addItemToStackedList(findNewItemIndex);
        }
        Iterator<sj60> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a(item);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    private final void addItemToStackedList(int index) {
        ?? r18;
        if (index >= 3) {
            return;
        }
        boolean z = true;
        this.isAddingItem = true;
        float f = this.topIndent + this.statusBarHeight;
        char c = 0;
        int measuredHeight = this.notifications.get(0).getMeasuredHeight();
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int size = this.notifications.size();
        int i = measuredHeight;
        int i2 = 0;
        float f2 = 0.0f;
        while (i2 < size) {
            NotificationItemComponent<?> notificationItemComponent = this.notifications.get(i2);
            float measuredWidth = notificationItemComponent.getMeasuredWidth() == 0 ? 0.0f : (notificationItemComponent.getMeasuredWidth() - f2) / notificationItemComponent.getMeasuredWidth();
            int measuredHeight2 = notificationItemComponent.getMeasuredHeight();
            if (i > measuredHeight2) {
                i = measuredHeight2;
            }
            if (notificationItemComponent.getMeasuredHeight() > i) {
                ValueAnimator ofInt = ValueAnimator.ofInt(notificationItemComponent.getMeasuredHeight(), i);
                r18 = z;
                ofInt.addUpdateListener(new oj60(notificationItemComponent, 6));
                arrayList.add(ofInt);
            } else {
                boolean z2 = z;
                r18 = z2;
                if (i2 > 0) {
                    int measuredHeight3 = notificationItemComponent.getMeasuredHeight();
                    Rect rect = xw31.a;
                    ru.yandex.taxi.design.utils.c.D(notificationItemComponent.getLayoutParams().width, measuredHeight3, notificationItemComponent);
                    r18 = z2;
                }
            }
            float[] fArr = new float[2];
            fArr[c] = notificationItemComponent.getScaleX();
            fArr[r18] = measuredWidth;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new oj60(notificationItemComponent, 7));
            char c2 = c;
            float[] fArr2 = new float[2];
            fArr2[c2] = notificationItemComponent.getY();
            fArr2[r18] = (measuredHeight + f) - i;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.addUpdateListener(new oj60(notificationItemComponent, 8));
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            if (i2 < 2) {
                f += this.topIndent;
                f2 += this.horizontalIndent * 2.0f;
            }
            i2++;
            z = r18;
            c = c2;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$addItemToStackedList$4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                NotificationStackComponent.this.isAddingItem = false;
                NotificationStackComponent.this.hideInvisibleItems();
                NotificationStackComponent.this.checkUpdateQueue();
                NotificationStackComponent.this.requestApplyInsets();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItemToStackedList$lambda$0(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(intValue, notificationItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItemToStackedList$lambda$1(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addItemToStackedList$lambda$2(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final void addUpdate(NotificationItemComponent<?> view, UpdateOperation op) {
        Object obj;
        if (op == UpdateOperation.REMOVE) {
            ycc.w(this.updateQueue, new ub60(r1, view), true);
        }
        boolean contains = this.notifications.contains(view);
        Iterator it = this.updateQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (jl40.l(((m) obj).b(), view)) {
                    break;
                }
            }
        }
        r1 = obj == null ? 0 : 1;
        if (op == UpdateOperation.REMOVE && contains && r1 == 0 && !this.removingItems.contains(view)) {
            this.updateQueue.addLast(new m(view, op));
        } else if (op == UpdateOperation.ADD && getNotification(view.getNotificationId()) == null) {
            this.updateQueue.addLast(new m(view, op));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean addUpdate$lambda$0(NotificationItemComponent notificationItemComponent, m mVar) {
        return jl40.l(mVar.b(), notificationItemComponent) && mVar.a() == UpdateOperation.ADD;
    }

    private final boolean canAddItem() {
        return (isAnimatingOrDragging() || this.isAddingItem || isRemovingItems() || this.isHidden) ? false : true;
    }

    private final boolean canRemoveItem() {
        return (isAnimatingOrDragging() || this.isAddingItem) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void cancelAnimationTask$lambda$0() {
    }

    private final void captureView(MotionEvent event) {
        if (this.capturedView == null && event.getAction() == 0) {
            NotificationItemComponent<?> tryCaptureAnyItem = this.isExpanded ? tryCaptureAnyItem(event) : tryCaptureTopItem(event);
            this.capturedView = tryCaptureAnyItem;
            if (kotlin.collections.a.G(this.removingItems, tryCaptureAnyItem)) {
                this.capturedView = null;
            }
        }
        NotificationItemComponent<?> notificationItemComponent = this.capturedView;
        if (notificationItemComponent != null) {
            updateOrCaptureView(event, notificationItemComponent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkUpdateQueue() {
        while (checkUpdateQueueOnce()) {
        }
    }

    private final boolean checkUpdateQueueOnce() {
        m mVar;
        if (this.updateQueue.isEmpty()) {
            return false;
        }
        if (canAddItem() && canRemoveItem()) {
            mVar = (m) this.updateQueue.removeFirst();
        } else {
            if (canRemoveItem()) {
                Iterator<E> it = this.updateQueue.iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (mVar2.a() == UpdateOperation.REMOVE) {
                        it.remove();
                        mVar = mVar2;
                        break;
                    }
                }
            }
            mVar = null;
        }
        if (mVar == null) {
            return false;
        }
        if (mVar.a() == UpdateOperation.ADD) {
            addItemInternal(mVar.b());
            return true;
        }
        if (mVar.a() != UpdateOperation.REMOVE) {
            return true;
        }
        removeItemInternal(mVar.b());
        return true;
    }

    private final void clearState() {
        this.isMovingToStackedState = false;
        this.isMovingToExpandState = false;
        this.isDraggedVertically = false;
        this.isDraggedHorizontally = false;
    }

    private final void closeListInternal(Runnable onAnimationEndRunnable) {
        moveToStackedState(onAnimationEndRunnable);
        cma1.d(this, mqg0.opaque_20_black, mqg0.transparent, 300L, 0L, null);
    }

    private final void closeNotification(final ViewGroup item, Animator.AnimatorListener onComplete) {
        AnimatorSet animatorSet = new AnimatorSet();
        AnimatorSet animatorSet2 = new AnimatorSet();
        final int i = 2;
        ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(125L);
        final int i2 = 0;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pj60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i3 = i2;
                ViewGroup viewGroup = item;
                switch (i3) {
                    case 0:
                        NotificationStackComponent.closeNotification$lambda$0(viewGroup, valueAnimator);
                        break;
                    case 1:
                        NotificationStackComponent.closeNotification$lambda$1(viewGroup, valueAnimator);
                        break;
                    case 2:
                        NotificationStackComponent.closeNotification$lambda$2(viewGroup, valueAnimator);
                        break;
                    default:
                        NotificationStackComponent.closeNotification$lambda$3(viewGroup, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        final int i3 = 1;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pj60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i3;
                ViewGroup viewGroup = item;
                switch (i32) {
                    case 0:
                        NotificationStackComponent.closeNotification$lambda$0(viewGroup, valueAnimator);
                        break;
                    case 1:
                        NotificationStackComponent.closeNotification$lambda$1(viewGroup, valueAnimator);
                        break;
                    case 2:
                        NotificationStackComponent.closeNotification$lambda$2(viewGroup, valueAnimator);
                        break;
                    default:
                        NotificationStackComponent.closeNotification$lambda$3(viewGroup, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, item.getWidth() == 0 ? 0.0f : (item.getWidth() - (this.horizontalIndent * 2.0f)) / item.getWidth());
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pj60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i;
                ViewGroup viewGroup = item;
                switch (i32) {
                    case 0:
                        NotificationStackComponent.closeNotification$lambda$0(viewGroup, valueAnimator);
                        break;
                    case 1:
                        NotificationStackComponent.closeNotification$lambda$1(viewGroup, valueAnimator);
                        break;
                    case 2:
                        NotificationStackComponent.closeNotification$lambda$2(viewGroup, valueAnimator);
                        break;
                    default:
                        NotificationStackComponent.closeNotification$lambda$3(viewGroup, valueAnimator);
                        break;
                }
            }
        });
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        final int i4 = 3;
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: pj60
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i32 = i4;
                ViewGroup viewGroup = item;
                switch (i32) {
                    case 0:
                        NotificationStackComponent.closeNotification$lambda$0(viewGroup, valueAnimator);
                        break;
                    case 1:
                        NotificationStackComponent.closeNotification$lambda$1(viewGroup, valueAnimator);
                        break;
                    case 2:
                        NotificationStackComponent.closeNotification$lambda$2(viewGroup, valueAnimator);
                        break;
                    default:
                        NotificationStackComponent.closeNotification$lambda$3(viewGroup, valueAnimator);
                        break;
                }
            }
        });
        animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet2.setDuration(250L);
        animatorSet.playSequentially(duration, animatorSet2);
        animatorSet.addListener(onComplete);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeNotification$lambda$0(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeNotification$lambda$1(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        viewGroup.setScaleY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeNotification$lambda$2(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        viewGroup.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void closeNotification$lambda$3(ViewGroup viewGroup, ValueAnimator valueAnimator) {
        viewGroup.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private final int findNewItemIndex(NotificationItemComponent<?> item) {
        Iterator<NotificationItemComponent<?>> it = this.notifications.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getNotificationPriority() <= item.getNotificationPriority()) {
                break;
            }
            i++;
        }
        return i == -1 ? this.notifications.size() : i;
    }

    private final Set<String> findNotificationIds(tls predicate) {
        j63 j63Var = new j63(0);
        x43 x43Var = this.updateQueue;
        ArrayList arrayList = new ArrayList();
        Iterator it = x43Var.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            m mVar = (m) next;
            if (mVar.a() == UpdateOperation.ADD && ((Boolean) predicate.invoke(mVar.b().getNotificationId())).booleanValue()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((m) it2.next()).b().getNotificationId());
        }
        j63Var.addAll(arrayList2);
        List<NotificationItemComponent<?>> list = this.notifications;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (((Boolean) predicate.invoke(((NotificationItemComponent) obj).getNotificationId())).booleanValue()) {
                arrayList3.add(obj);
            }
        }
        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((NotificationItemComponent) it3.next()).getNotificationId());
        }
        j63Var.addAll(arrayList4);
        return j63Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishRemovingItem(NotificationItemComponent<?> view, boolean removedManually) {
        if (view == null) {
            xby.d.k(new IllegalStateException("Call detach for already released notification"), "Notification was removed ".concat(removedManually ? "manually" : "not manually"));
            return;
        }
        this.itemsContainer.removeView(view);
        view.onDetachNotification(removedManually);
        removeNotification(view);
        this.removingItems.remove(view);
        Iterator<sj60> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().b(view, removedManually);
        }
    }

    private final ValueAnimator getItemOutOfScreenHorizontallyAnimator(View view, boolean moveOutToLeft, Animator.AnimatorListener onEnd) {
        NotificationItemComponent<?> notificationItemComponent = this.capturedView;
        if (notificationItemComponent == null) {
            return null;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(notificationItemComponent.getX(), moveOutToLeft ? -view.getWidth() : getWidth()).setDuration(300L);
        duration.setInterpolator(new FastOutLinearInInterpolator());
        duration.addListener(onEnd);
        duration.addUpdateListener(new qj60(this, view, 3));
        return duration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getItemOutOfScreenHorizontallyAnimator$lambda$0(NotificationStackComponent notificationStackComponent, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        notificationStackComponent.updateActualItemsHorizontallyPositions(notificationStackComponent.capturedViewStartX, floatValue);
        view.setX(floatValue);
    }

    private final ValueAnimator getItemOutOfScreenVerticallyAnimator(View view, Animator.AnimatorListener onEnd) {
        NotificationItemComponent<?> notificationItemComponent = this.capturedView;
        if (notificationItemComponent == null) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(notificationItemComponent.getY(), -view.getHeight());
        ofFloat.addListener(onEnd);
        ofFloat.addUpdateListener(new qj60(this, view, 0));
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getItemOutOfScreenVerticallyAnimator$lambda$0(NotificationStackComponent notificationStackComponent, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        notificationStackComponent.updateActualItemsVerticallyPositions(notificationStackComponent.capturedViewStartY, floatValue);
        view.setY(floatValue);
    }

    private final float getScaledTouchSlop() {
        return ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideInternal() {
        ValueAnimator ofInt = ValueAnimator.ofInt((int) getY(), -(getHeight() + getTop()));
        ofInt.addUpdateListener(new yd2(3, this));
        ofInt.setDuration(200L);
        ofInt.addListener(new NotificationStackComponent$hideInternal$2(this));
        ofInt.start();
        this.cancelAnimationTask = new ssu(16, ofInt);
        this.isHidden = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hideInternal$lambda$0(NotificationStackComponent notificationStackComponent, ValueAnimator valueAnimator) {
        notificationStackComponent.setY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideInvisibleItems() {
        int size = this.notifications.size();
        for (int i = 3; i < size; i++) {
            this.notifications.get(i).setAlpha(1.0f);
            this.notifications.get(i).setVisibility(8);
        }
    }

    private final float inspectAllowableBottomPosition(float deltaY) {
        float f = this.capturedViewStartY + deltaY;
        float f2 = this.topIndent + this.statusBarHeight;
        return f > f2 ? f2 : f;
    }

    private final boolean isAnimatingOrDragging() {
        return this.isDraggedHorizontally || this.isDraggedVertically || this.isMovingToExpandState || this.isMovingToStackedState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAnyItemTarget(MotionEvent event) {
        Iterator<NotificationItemComponent<?>> it = this.notifications.iterator();
        while (it.hasNext()) {
            if (isInsideItem(it.next(), event)) {
                return true;
            }
        }
        return false;
    }

    private final boolean isCaptured() {
        return this.isDraggedHorizontally || this.isDraggedVertically;
    }

    private final boolean isInsideItem(View item, MotionEvent ev) {
        Rect rect = new Rect();
        item.getHitRect(rect);
        rect.offset(0, -this.scrollView.getScrollY());
        return rect.contains((int) ev.getX(), (int) ev.getY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isRemovingItems() {
        return !this.removingItems.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isTopItemTarget(MotionEvent ev) {
        if (this.notifications.isEmpty()) {
            return false;
        }
        return isInsideItem(this.notifications.get(0), ev);
    }

    private final void measureExpandedItem(View item) {
        item.measure(View.MeasureSpec.makeMeasureSpec((int) (getWidth() - (this.horizontalIndent * 2.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveItemOutOfScreen(final NotificationItemComponent<?> view, boolean moveOutToLeft, boolean moveOutToRight, boolean moveOutToTop) {
        AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveItemOutOfScreen$onEnd$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ValueAnimator valueAnimator;
                valueAnimator = NotificationStackComponent.this.moveOutAnimator;
                if (jl40.l(valueAnimator, animator)) {
                    NotificationStackComponent.this.moveOutAnimator = null;
                }
                NotificationStackComponent.this.finishRemovingItem(view, true);
                if (jl40.l(NotificationStackComponent.this.capturedView, view)) {
                    NotificationStackComponent.this.capturedView = null;
                }
                if (NotificationStackComponent.this.notifications.size() <= 1 && NotificationStackComponent.this.getIsExpanded()) {
                    NotificationStackComponent.this.closeList();
                    return;
                }
                boolean isExpanded = NotificationStackComponent.this.getIsExpanded();
                NotificationStackComponent notificationStackComponent = NotificationStackComponent.this;
                if (isExpanded) {
                    notificationStackComponent.moveToExpandState();
                } else {
                    notificationStackComponent.moveToStackedState(null);
                }
            }
        };
        if (moveOutToLeft || moveOutToRight) {
            this.moveOutAnimator = getItemOutOfScreenHorizontallyAnimator(view, moveOutToLeft, animatorListenerAdapter);
        } else if (moveOutToTop) {
            this.moveOutAnimator = getItemOutOfScreenVerticallyAnimator(view, animatorListenerAdapter);
        }
        ValueAnimator valueAnimator = this.moveOutAnimator;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    private final void moveItemToCanonicalPositionX(View view) {
        int i = 2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getX(), this.leftMargin);
        this.moveInAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator = this.moveInAnimator;
        if (valueAnimator != null) {
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveItemToCanonicalPositionX$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    NotificationStackComponent.this.onMoveInAnimationEnd(animator);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.moveInAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new qj60(this, view, i));
        }
        ValueAnimator valueAnimator3 = this.moveInAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveItemToCanonicalPositionX$lambda$0(NotificationStackComponent notificationStackComponent, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        notificationStackComponent.updateActualItemsHorizontallyPositions(notificationStackComponent.capturedViewStartX, floatValue);
        view.setX(floatValue);
    }

    private final void moveItemToCanonicalPositionY(View view) {
        int i = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(view.getY(), this.topIndent + this.statusBarHeight);
        this.moveInAnimator = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator = this.moveInAnimator;
        if (valueAnimator != null) {
            valueAnimator.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveItemToCanonicalPositionY$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    NotificationStackComponent.this.onMoveInAnimationEnd(animator);
                }
            });
        }
        ValueAnimator valueAnimator2 = this.moveInAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new qj60(this, view, i));
        }
        ValueAnimator valueAnimator3 = this.moveInAnimator;
        if (valueAnimator3 != null) {
            valueAnimator3.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveItemToCanonicalPositionY$lambda$0(NotificationStackComponent notificationStackComponent, View view, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        notificationStackComponent.updateActualItemsVerticallyPositions(notificationStackComponent.capturedViewStartY, floatValue);
        view.setY(floatValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToExpandState() {
        int i;
        if (this.isHidden) {
            return;
        }
        int i2 = 1;
        this.isMovingToExpandState = true;
        float f = this.listTopMargin + this.statusBarHeight;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int size = this.notifications.size();
        int i3 = 0;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            final NotificationItemComponent<?> notificationItemComponent = this.notifications.get(i3);
            int height = notificationItemComponent.getHeight();
            measureExpandedItem(notificationItemComponent);
            int measuredHeight = notificationItemComponent.getMeasuredHeight();
            notificationItemComponent.setVisibility(0);
            ValueAnimator ofInt = ValueAnimator.ofInt(height, measuredHeight);
            ofInt.addUpdateListener(new oj60(notificationItemComponent, 3));
            arrayList.add(ofInt);
            ofInt.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveToExpandState$2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    super.onAnimationEnd(animation);
                    NotificationItemComponent<?> notificationItemComponent2 = notificationItemComponent;
                    Rect rect = xw31.a;
                    ru.yandex.taxi.design.utils.c.C(-2, notificationItemComponent2);
                }
            });
            ValueAnimator ofInt2 = ValueAnimator.ofInt((int) notificationItemComponent.getY(), (int) f);
            ofInt2.addUpdateListener(new oj60(notificationItemComponent, 4));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(notificationItemComponent.getScaleX(), 1.0f);
            ofFloat.addUpdateListener(new oj60(notificationItemComponent, 5));
            arrayList.add(ofInt2);
            arrayList.add(ofFloat);
            f += measuredHeight + this.listSpacing;
            i3++;
        }
        float height2 = this.scrollView.getHeight();
        if (f <= height2) {
            height2 = f;
        }
        if (this.isExpanded) {
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.collapseButton.getY(), height2);
            ofFloat2.addUpdateListener(new nj60(this, i2));
            arrayList.add(ofFloat2);
            ValueAnimator ofInt3 = ValueAnimator.ofInt((int) this.allItemsHeight, (int) f);
            ofInt3.addUpdateListener(new nj60(this, i));
            arrayList.add(ofInt3);
        } else {
            setAllItemsHeight(f);
            this.collapseButton.setVisibility(0);
            this.collapseButton.setY(height2);
            this.scrollView.setScrollEnabled(true);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new FastOutLinearInInterpolator());
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveToExpandState$7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                NotificationStackComponent.this.onExpanded();
            }
        });
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToExpandState$lambda$0(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(intValue, notificationItemComponent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToExpandState$lambda$1(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToExpandState$lambda$2(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToExpandState$lambda$3(NotificationStackComponent notificationStackComponent, ValueAnimator valueAnimator) {
        notificationStackComponent.collapseButton.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToExpandState$lambda$4(NotificationStackComponent notificationStackComponent, ValueAnimator valueAnimator) {
        notificationStackComponent.setAllItemsHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void moveToStackedState(final Runnable onAnimationEndRunnable) {
        int i;
        if (this.isHidden) {
            return;
        }
        int i2 = 1;
        this.isMovingToStackedState = true;
        float f = this.topIndent + this.statusBarHeight;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (this.notifications.isEmpty()) {
            i = 0;
        } else {
            NotificationItemComponent<?> notificationItemComponent = this.notifications.get(0);
            measureExpandedItem(notificationItemComponent);
            i = notificationItemComponent.getMeasuredHeight();
        }
        int size = this.notifications.size();
        int i4 = i;
        int i5 = 0;
        float f2 = 0.0f;
        while (i5 < size) {
            NotificationItemComponent<?> notificationItemComponent2 = this.notifications.get(i5);
            notificationItemComponent2.setVisibility(0);
            float width = notificationItemComponent2.getWidth() == 0 ? 0.0f : (notificationItemComponent2.getWidth() - f2) / notificationItemComponent2.getWidth();
            if (i5 == 0) {
                i4 = i;
            } else {
                int height = notificationItemComponent2.getHeight();
                if (height <= i4) {
                    i4 = height;
                }
            }
            float f3 = i5 == 0 ? f : (i + f) - i4;
            int i6 = i2;
            float[] fArr = new float[2];
            fArr[0] = notificationItemComponent2.getY();
            fArr[i6] = f3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new oj60(notificationItemComponent2, i3));
            float[] fArr2 = new float[2];
            fArr2[0] = notificationItemComponent2.getScaleX();
            fArr2[i6] = width;
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(fArr2);
            ofFloat2.addUpdateListener(new oj60(notificationItemComponent2, i6));
            ValueAnimator ofInt = ValueAnimator.ofInt(notificationItemComponent2.getHeight(), i4);
            ofInt.addUpdateListener(new oj60(notificationItemComponent2, 2));
            arrayList.add(ofInt);
            arrayList.add(ofFloat);
            arrayList.add(ofFloat2);
            if (i5 < 2) {
                f += this.topIndent;
                f2 += this.horizontalIndent * 2.0f;
            }
            i5++;
            i2 = 1;
        }
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$moveToStackedState$4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (!NotificationStackComponent.this.notifications.isEmpty()) {
                    View view = (View) NotificationStackComponent.this.notifications.get(0);
                    Rect rect = xw31.a;
                    ru.yandex.taxi.design.utils.c.C(-2, view);
                }
                NotificationStackComponent.this.hideInvisibleItems();
                NotificationStackComponent.this.onStacked();
                Runnable runnable = onAnimationEndRunnable;
                if (runnable != null) {
                    runnable.run();
                }
            }
        });
        animatorSet.setInterpolator(new DecelerateInterpolator());
        animatorSet.setDuration(300L);
        animatorSet.start();
        this.collapseButton.setVisibility(4);
        this.scrollView.smoothScrollTo(0, 0);
        this.scrollView.setScrollEnabled(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToStackedState$lambda$0(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToStackedState$lambda$1(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        notificationItemComponent.setScaleX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void moveToStackedState$lambda$2(NotificationItemComponent notificationItemComponent, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(intValue, notificationItemComponent);
    }

    private final void notifyExpandStateChanged() {
        Iterator<sj60> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
    }

    private final void notifyNotificationShownInFront(NotificationItemComponent<?> notification) {
        Iterator<sj60> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().c(notification);
        }
    }

    private final void notifyNotificationsShownInFront() {
        Iterator it = new ArrayList(this.notifications).iterator();
        while (it.hasNext()) {
            NotificationItemComponent<?> notificationItemComponent = (NotificationItemComponent) it.next();
            if (xw31.i(notificationItemComponent)) {
                notifyNotificationShownInFront(notificationItemComponent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean onAttachedToWindow$lambda$1(NotificationStackComponent notificationStackComponent, t1w t1wVar) {
        int i = notificationStackComponent.statusBarHeight;
        int i2 = t1wVar.b;
        if (i < i2) {
            notificationStackComponent.statusBarHeight = i2;
        }
        if (!notificationStackComponent.isAddingItem && notificationStackComponent.windowHeight > notificationStackComponent.getHeight()) {
            float f = notificationStackComponent.topIndent + notificationStackComponent.statusBarHeight;
            Iterator<NotificationItemComponent<?>> it = notificationStackComponent.notifications.iterator();
            while (it.hasNext()) {
                it.next().setY(f);
                f += r1.getHeight() + notificationStackComponent.topIndent;
            }
        }
        notificationStackComponent.windowHeight = notificationStackComponent.getHeight();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onExpanded() {
        this.isExpanded = true;
        clearState();
        checkUpdateQueue();
        notifyNotificationsShownInFront();
        notifyExpandStateChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMoveInAnimationEnd(Animator animator) {
        if (jl40.l(animator, this.moveInAnimator)) {
            this.moveInAnimator = null;
        }
        clearState();
        checkUpdateQueue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStacked() {
        this.isExpanded = false;
        clearState();
        checkUpdateQueue();
        notifyExpandStateChanged();
    }

    private final void prepareNextItem(View item) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) item.getLayoutParams();
        layoutParams.leftMargin = this.leftMargin;
        layoutParams.rightMargin = this.rightMargin;
        item.setLayoutParams(layoutParams);
        setPivotY(0.0f);
    }

    private final void removeItemInternal(NotificationItemComponent<?> view) {
        int indexOf = this.notifications.indexOf(view);
        if (indexOf < 0) {
            xby.d.k(new IllegalStateException("Item to remove not found"), "Item to remove not found");
            checkUpdateQueue();
            return;
        }
        final NotificationItemComponent<?> notificationItemComponent = this.notifications.get(indexOf);
        if (this.removingItems.contains(notificationItemComponent)) {
            return;
        }
        this.removingItems.add(notificationItemComponent);
        if (indexOf < 3 && !this.isHidden) {
            closeNotification(notificationItemComponent, new AnimatorListenerAdapter() { // from class: ru.yandex.taxi.design.NotificationStackComponent$removeItemInternal$1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    boolean z;
                    boolean isRemovingItems;
                    NotificationStackComponent.this.finishRemovingItem(notificationItemComponent, false);
                    z = NotificationStackComponent.this.isMovingToExpandState;
                    if (z || NotificationStackComponent.this.isMovingToStackedState) {
                        return;
                    }
                    isRemovingItems = NotificationStackComponent.this.isRemovingItems();
                    if (isRemovingItems) {
                        return;
                    }
                    if (NotificationStackComponent.this.notifications.size() <= 1 && NotificationStackComponent.this.getIsExpanded()) {
                        NotificationStackComponent.this.closeList();
                        return;
                    }
                    boolean isExpanded = NotificationStackComponent.this.getIsExpanded();
                    NotificationStackComponent notificationStackComponent = NotificationStackComponent.this;
                    if (isExpanded) {
                        notificationStackComponent.moveToExpandState();
                    } else {
                        notificationStackComponent.moveToStackedState(null);
                    }
                }
            });
        } else {
            finishRemovingItem(notificationItemComponent, false);
            checkUpdateQueue();
        }
    }

    private final void removeNotification(NotificationItemComponent<?> view) {
        int size = this.notifications.size();
        for (int i = 0; i < size; i++) {
            if (this.notifications.get(i) == view) {
                this.notifications.remove(i);
                subscribeToTopItemLayoutChanges();
                return;
            }
        }
    }

    private final void resetCapturedViewAndDraggingState() {
        this.capturedView = null;
        this.isDraggedVertically = false;
        this.isDraggedHorizontally = false;
    }

    private final void setAllItemsHeight(float height) {
        if (this.allItemsHeight == height) {
            return;
        }
        this.allItemsHeight = height;
        this.itemsContainer.setMinimumHeight((int) height);
        ViewGroup viewGroup = this.itemsContainer;
        int i = (int) this.allItemsHeight;
        Rect rect = xw31.a;
        ru.yandex.taxi.design.utils.c.C(i, viewGroup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showInternal() {
        ValueAnimator ofInt = ValueAnimator.ofInt((int) getY(), getTop());
        ofInt.addUpdateListener(new nj60(this, 0));
        ofInt.setDuration(200L);
        ofInt.addListener(new NotificationStackComponent$showInternal$2(this));
        ofInt.start();
        this.cancelAnimationTask = new sf30(22, ofInt);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInternal$lambda$0(NotificationStackComponent notificationStackComponent, ValueAnimator valueAnimator) {
        notificationStackComponent.setY(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    private final void subscribeToTopItemLayoutChanges() {
        NotificationItemComponent<?> notificationItemComponent = !this.notifications.isEmpty() ? this.notifications.get(0) : null;
        View view = this.lastTopItem;
        if (view == notificationItemComponent) {
            return;
        }
        if (view != null) {
            view.removeOnLayoutChangeListener(this.topItemLayoutChangeListener);
        }
        this.lastTopItem = notificationItemComponent;
        if (notificationItemComponent != null) {
            notificationItemComponent.addOnLayoutChangeListener(this.topItemLayoutChangeListener);
            notifyNotificationShownInFront(notificationItemComponent);
        }
    }

    private final NotificationItemComponent<?> tryCaptureAnyItem(MotionEvent event) {
        for (NotificationItemComponent<?> notificationItemComponent : this.notifications) {
            if (isInsideItem(notificationItemComponent, event)) {
                return notificationItemComponent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NotificationItemComponent<?> tryCaptureTopItem(MotionEvent event) {
        if (isTopItemTarget(event)) {
            return this.notifications.get(0);
        }
        return null;
    }

    private final void updateActualItemsHorizontallyPositions(float factor) {
        if (this.isExpanded || this.notifications.size() < 2) {
            return;
        }
        float f = this.horizontalIndent * 2.0f;
        int height = this.notifications.get(0).getHeight();
        int i = 1;
        int height2 = this.notifications.get(1).getHeight();
        int size = this.notifications.size();
        float f2 = 1.0f;
        while (i < size) {
            NotificationItemComponent<?> notificationItemComponent = this.notifications.get(i);
            if (i == 3) {
                notificationItemComponent.setVisibility(0);
                return;
            }
            float width = notificationItemComponent.getWidth() == 0 ? 0.0f : (notificationItemComponent.getWidth() - f) / notificationItemComponent.getWidth();
            notificationItemComponent.setScaleX(((f2 - width) * factor) + width);
            int i2 = i + 1;
            float height3 = (((i2 * this.topIndent) + this.statusBarHeight) + height) - notificationItemComponent.getHeight();
            notificationItemComponent.setY(((((((i * this.topIndent) + this.statusBarHeight) + height2) - notificationItemComponent.getHeight()) - height3) * factor) + height3);
            f += this.horizontalIndent * 2.0f;
            i = i2;
            f2 = width;
        }
    }

    private final void updateActualItemsVerticallyPositions(float capturedViewStartY, float currentY) {
        if (currentY > capturedViewStartY) {
            return;
        }
        if (currentY < 0.0f) {
            currentY = 0.0f;
        }
        if (capturedViewStartY == 0.0f) {
            capturedViewStartY = 1.0f;
        }
        updateActualItemsHorizontallyPositions(1.0f - (currentY / capturedViewStartY));
    }

    private final void updateOrCaptureView(MotionEvent event, NotificationItemComponent<?> focusedView) {
        int action = event.getAction();
        if (action == 0) {
            this.capturedView = focusedView;
            this.capturedViewStartX = focusedView.getX();
            this.capturedViewStartY = focusedView.getY();
            this.startTouchX = event.getX();
            this.startTouchY = event.getY();
            return;
        }
        if (action != 1) {
            if (action == 2) {
                if (this.capturedView == null) {
                    xby.d.w(new NullPointerException(oyr.i(action, "Missing capture view for action: ")));
                    return;
                }
                float x = event.getX() - this.startTouchX;
                float y = event.getY() - this.startTouchY;
                if (!isCaptured()) {
                    if (Math.abs(x) > Math.abs(y)) {
                        if (Math.abs(x) > getScaledTouchSlop()) {
                            this.isDraggedHorizontally = true;
                            this.isDraggedVertically = false;
                        }
                    } else if (Math.abs(y) > getScaledTouchSlop() && !this.isExpanded) {
                        this.isDraggedVertically = true;
                        this.isDraggedHorizontally = false;
                    }
                }
                if (this.isDraggedHorizontally) {
                    NotificationItemComponent<?> notificationItemComponent = this.capturedView;
                    if (notificationItemComponent != null) {
                        notificationItemComponent.setX(this.capturedViewStartX + x);
                    }
                    float f = this.capturedViewStartX;
                    updateActualItemsHorizontallyPositions(f, x + f);
                    return;
                }
                if (this.isDraggedVertically) {
                    float inspectAllowableBottomPosition = inspectAllowableBottomPosition(y);
                    NotificationItemComponent<?> notificationItemComponent2 = this.capturedView;
                    if (notificationItemComponent2 != null) {
                        notificationItemComponent2.setY(inspectAllowableBottomPosition);
                    }
                    updateActualItemsVerticallyPositions(this.capturedViewStartY, inspectAllowableBottomPosition);
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        NotificationItemComponent<?> notificationItemComponent3 = this.capturedView;
        if (notificationItemComponent3 == null) {
            xby.d.w(new NullPointerException(oyr.i(action, "Missing capture view for action: ")));
            return;
        }
        boolean z = notificationItemComponent3.getX() + ((float) notificationItemComponent3.getWidth()) < (((float) getWidth()) * 2.0f) / 3.0f;
        boolean z2 = notificationItemComponent3.getX() > ((float) getWidth()) / 3.0f;
        boolean z3 = notificationItemComponent3.getY() < 0.0f;
        if (notificationItemComponent3.getIsDismissible() && (z || z2 || z3)) {
            moveItemOutOfScreen(notificationItemComponent3, z, z2, z3);
        } else if (this.isDraggedHorizontally) {
            moveItemToCanonicalPositionX(notificationItemComponent3);
        } else if (this.isDraggedVertically) {
            moveItemToCanonicalPositionY(notificationItemComponent3);
        }
        this.isDraggedHorizontally = false;
        this.isDraggedVertically = false;
        this.capturedView = null;
    }

    private final void updateZ() {
        float f = this.topItemZ;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        float i = ViewCompat$Api21Impl.i(this) + f;
        Iterator<NotificationItemComponent<?>> it = this.notifications.iterator();
        while (it.hasNext()) {
            ViewCompat$Api21Impl.r(it.next(), i);
            i -= 1.0f;
        }
    }

    public final void addListener(sj60 listener) {
        this.listeners.add(listener);
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

    public final void closeList() {
        if (this.isExpanded) {
            closeListInternal(null);
        }
    }

    public final void closeNotifications(tls notificationIdPredicate) {
        Iterator<String> it = findNotificationIds(notificationIdPredicate).iterator();
        while (it.hasNext()) {
            closeNotification(it.next());
        }
    }

    public final void dropOffset() {
        this.isHidden = false;
    }

    public final void expandList() {
        if (this.isExpanded) {
            return;
        }
        moveToExpandState();
        cma1.d(this, mqg0.transparent, mqg0.opaque_20_black, 300L, 0L, null);
    }

    public final NotificationItemComponent<?> getNotification(String notificationId) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterator<E> it = this.updateQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            m mVar = (m) obj;
            if (mVar.a() == UpdateOperation.ADD && jl40.l(mVar.b().getNotificationId(), notificationId)) {
                break;
            }
        }
        m mVar2 = (m) obj;
        if (mVar2 != null) {
            return mVar2.b();
        }
        Iterator<T> it2 = this.notifications.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (jl40.l(((NotificationItemComponent) obj2).getNotificationId(), notificationId)) {
                break;
            }
        }
        NotificationItemComponent<?> notificationItemComponent = (NotificationItemComponent) obj2;
        Iterator<E> it3 = this.updateQueue.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (jl40.l(((m) obj3).b().getNotificationId(), notificationId)) {
                break;
            }
        }
        boolean z = obj3 != null;
        if (notificationItemComponent == null || z || this.removingItems.contains(notificationItemComponent)) {
            return null;
        }
        return notificationItemComponent;
    }

    public final NotificationItemComponent<?> getTopNotificationItem() {
        if (this.notifications.isEmpty()) {
            return null;
        }
        return this.notifications.get(0);
    }

    public final void hide() {
        if (this.isExpanded) {
            closeListInternal(new ssu(17, this));
            return;
        }
        this.showCancellable.cancel();
        this.cancelAnimationTask.run();
        hideInternal();
    }

    /* renamed from: isExpanded, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    /* renamed from: isHidden, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, xq31] */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        final boolean z = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.design.NotificationStackComponent$onAttachedToWindow$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                ListItemComponent listItemComponent;
                NotificationsScrollView notificationsScrollView = this.scrollView;
                int height = this.getHeight();
                listItemComponent = this.collapseButton;
                int height2 = height - listItemComponent.getHeight();
                Rect rect = xw31.a;
                ru.yandex.taxi.design.utils.c.C(height2, notificationsScrollView);
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new xq31(viewTreeObserver, onPreDrawListener, this);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.onPreDrawCancellable = (g18) ref$ObjectRef.element;
        this.autoPaddingsCancellable = tje.i(this, 48, new weu(16, this));
        requestApplyInsets();
    }

    public final boolean onBackPressed() {
        if (!this.isExpanded) {
            return false;
        }
        closeList();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.onPreDrawCancellable.cancel();
        this.showCancellable.cancel();
        this.autoPaddingsCancellable.cancel();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (event.getAction() == 0) {
            this.ignoreTouchEvents = (this.isExpanded || isTopItemTarget(event)) ? false : true;
            resetCapturedViewAndDraggingState();
        }
        if (this.ignoreTouchEvents || this.isMovingToExpandState || this.isMovingToStackedState) {
            return true;
        }
        if (this.gestureDetector.onTouchEvent(event)) {
            resetCapturedViewAndDraggingState();
            return true;
        }
        captureView(event);
        return (this.notifications.size() > 1 && !this.isExpanded) || isCaptured();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.ignoreTouchEvents) {
            return false;
        }
        if (event.getAction() == 0) {
            resetCapturedViewAndDraggingState();
        }
        if (!this.isExpanded && !isTopItemTarget(event) && event.getAction() == 0) {
            return false;
        }
        if (!this.isMovingToExpandState && !this.isMovingToStackedState) {
            if (this.gestureDetector.onTouchEvent(event)) {
                resetCapturedViewAndDraggingState();
                return true;
            }
            captureView(event);
        }
        return true;
    }

    public final void removeListener(sj60 listener) {
        this.listeners.remove(listener);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [T, dai] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, xq31] */
    public final void show() {
        if (this.isExpanded) {
            return;
        }
        this.cancelAnimationTask.run();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = g18.u1;
        final boolean z = true;
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: ru.yandex.taxi.design.NotificationStackComponent$show$$inlined$doOnPreDrawCancelable$1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                this.showInternal();
                ((g18) Ref$ObjectRef.this.element).cancel();
                return z;
            }
        };
        ref$ObjectRef.element = new xq31(viewTreeObserver, onPreDrawListener, this);
        viewTreeObserver.addOnPreDrawListener(onPreDrawListener);
        this.showCancellable = (g18) ref$ObjectRef.element;
    }

    public final void showNotification(NotificationItemComponent<?> item) {
        addUpdate(item, UpdateOperation.ADD);
        checkUpdateQueue();
    }

    private final void updateActualItemsHorizontallyPositions(float startX, float currentX) {
        float abs = getWidth() == 0 ? 0.0f : Math.abs(currentX - startX) / getWidth();
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        updateActualItemsHorizontallyPositions(abs);
    }

    public final void closeNotification(String notificationId) {
        NotificationItemComponent<?> notification = getNotification(notificationId);
        if (notification != null) {
            closeNotification(notification);
        }
    }

    public final void closeNotification(NotificationItemComponent<?> item) {
        addUpdate(item, UpdateOperation.REMOVE);
        checkUpdateQueue();
    }

    public NotificationStackComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public NotificationStackComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ NotificationStackComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.notificationStackComponentStyle : i);
    }
}
