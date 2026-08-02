package ru.yandex.taxi.widget.dialog;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import defpackage.b64;
import defpackage.bdc;
import defpackage.c4i0;
import defpackage.cdc;
import defpackage.cma1;
import defpackage.dl40;
import defpackage.dzg0;
import defpackage.e32;
import defpackage.edj;
import defpackage.evu0;
import defpackage.f32;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.kdc;
import defpackage.lq31;
import defpackage.lxn;
import defpackage.mh3;
import defpackage.mq31;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mx60;
import defpackage.mzh0;
import defpackage.ndh0;
import defpackage.nu31;
import defpackage.nwy0;
import defpackage.ny61;
import defpackage.ohp0;
import defpackage.q37;
import defpackage.qc;
import defpackage.rp31;
import defpackage.rwt0;
import defpackage.sph0;
import defpackage.sz4;
import defpackage.tf91;
import defpackage.tje;
import defpackage.tz4;
import defpackage.udq0;
import defpackage.uz4;
import defpackage.vng;
import defpackage.vz4;
import defpackage.wms;
import defpackage.wz4;
import defpackage.x42;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zi;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.analytics.DialogCloseReason;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.CardComponent;
import ru.yandex.taxi.design.ListHeaderComponent;
import ru.yandex.taxi.design.ListTextComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.ui.DebounceClickListener;
import ru.yandex.taxi.widget.dialog.BaseDialog;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0016\u0018\u0000 Ï\u0001*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\nÐ\u0001Ñ\u0001Ò\u0001\u0088\u0001Ó\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u0010B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0011B#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0014¢\u0006\u0004\b!\u0010\u0015J\u0011\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J'\u0010-\u001a\u0012\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010,\u0018\u00010*2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0013H\u0014¢\u0006\u0004\b/\u0010\u0015J\u0017\u00103\u001a\u0002022\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0013H\u0014¢\u0006\u0004\b5\u0010\u0015J\u000f\u00106\u001a\u00020\u0013H\u0014¢\u0006\u0004\b6\u0010\u0015J\u000f\u00107\u001a\u00020\u0013H\u0015¢\u0006\u0004\b7\u0010\u0015J\u000f\u00108\u001a\u00020\u0013H\u0015¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u000202H\u0016¢\u0006\u0004\b9\u0010:J\r\u0010;\u001a\u00028\u0000¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u0013H\u0014¢\u0006\u0004\b=\u0010\u0015J\u000f\u0010>\u001a\u00020\u0013H\u0017¢\u0006\u0004\b>\u0010\u0015J\u0019\u0010@\u001a\u00028\u00002\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010@\u001a\u00028\u00002\b\b\u0001\u0010?\u001a\u00020\f¢\u0006\u0004\b@\u0010BJ!\u0010@\u001a\u00028\u00002\b\u0010?\u001a\u0004\u0018\u00010\u00192\b\u0010C\u001a\u0004\u0018\u00010+¢\u0006\u0004\b@\u0010DJ\u0015\u0010G\u001a\u00028\u00002\u0006\u0010F\u001a\u00020E¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00028\u00002\b\b\u0001\u0010I\u001a\u00020\f¢\u0006\u0004\bJ\u0010BJ\u0017\u0010J\u001a\u00028\u00002\b\u0010L\u001a\u0004\u0018\u00010K¢\u0006\u0004\bJ\u0010MJ\r\u0010O\u001a\u00020N¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00028\u00002\b\b\u0001\u0010I\u001a\u00020\f¢\u0006\u0004\bQ\u0010BJ\u0017\u0010S\u001a\u00028\u00002\b\b\u0001\u0010R\u001a\u00020\f¢\u0006\u0004\bS\u0010BJ\u0019\u0010U\u001a\u00028\u00002\b\u0010T\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bU\u0010AJ!\u0010U\u001a\u00028\u00002\b\u0010T\u001a\u0004\u0018\u00010\u00192\b\u0010V\u001a\u0004\u0018\u00010+¢\u0006\u0004\bU\u0010DJ\u0017\u0010U\u001a\u00028\u00002\b\b\u0001\u0010T\u001a\u00020\f¢\u0006\u0004\bU\u0010BJ3\u0010[\u001a\u00028\u00002\u0006\u0010W\u001a\u00020+2\b\u0010X\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+¢\u0006\u0004\b[\u0010\\J)\u0010[\u001a\u00028\u00002\u0006\u0010W\u001a\u00020\u00192\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+¢\u0006\u0004\b[\u0010]J\u001f\u0010[\u001a\u00028\u00002\u0006\u0010W\u001a\u00020\u00192\b\u0010Y\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b[\u0010^J+\u0010[\u001a\u00028\u00002\b\b\u0001\u0010W\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+¢\u0006\u0004\b[\u0010_J!\u0010[\u001a\u00028\u00002\b\b\u0001\u0010W\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b[\u0010`J)\u0010a\u001a\u00028\u00002\u0006\u0010W\u001a\u00020\u00192\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+¢\u0006\u0004\ba\u0010]J\u001f\u0010a\u001a\u00028\u00002\u0006\u0010W\u001a\u00020\u00192\b\u0010Y\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\ba\u0010^J+\u0010a\u001a\u00028\u00002\b\b\u0001\u0010W\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+¢\u0006\u0004\ba\u0010_J!\u0010a\u001a\u00028\u00002\b\b\u0001\u0010W\u001a\u00020\f2\b\u0010Y\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\ba\u0010`J\u0015\u0010d\u001a\u00028\u00002\u0006\u0010c\u001a\u00020b¢\u0006\u0004\bd\u0010eJ\u0015\u0010g\u001a\u00028\u00002\u0006\u0010f\u001a\u000202¢\u0006\u0004\bg\u0010hJ\u0015\u0010j\u001a\u00028\u00002\u0006\u0010i\u001a\u000202¢\u0006\u0004\bj\u0010hJ\u0015\u0010l\u001a\u00028\u00002\u0006\u0010k\u001a\u00020\u0016¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00028\u00002\b\u0010n\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\bo\u0010mJ\u0015\u0010q\u001a\u00028\u00002\u0006\u0010p\u001a\u000202¢\u0006\u0004\bq\u0010hJ\u0015\u0010r\u001a\u00028\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\br\u0010sJ\u0017\u0010r\u001a\u00028\u00002\b\b\u0001\u0010t\u001a\u00020\f¢\u0006\u0004\br\u0010BJ\u0015\u0010v\u001a\u00028\u00002\u0006\u0010u\u001a\u000202¢\u0006\u0004\bv\u0010hJ\u0019\u0010x\u001a\u00028\u00002\b\u0010w\u001a\u0004\u0018\u00010\"H\u0007¢\u0006\u0004\bx\u0010yJ\u0019\u0010|\u001a\u00028\u00002\b\u0010{\u001a\u0004\u0018\u00010zH\u0007¢\u0006\u0004\b|\u0010}J\r\u0010~\u001a\u000202¢\u0006\u0004\b~\u0010:J\r\u0010\u007f\u001a\u000202¢\u0006\u0004\b\u007f\u0010:J\u0011\u0010\u0080\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u0015J\u0011\u0010\u0081\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u0015J$\u0010\u0082\u0001\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0084\u0001\u0010\u0015J\u0011\u0010\u0085\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0085\u0001\u0010\u0015J\u0011\u0010\u0086\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0086\u0001\u0010\u0015J\u0011\u0010\u0087\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0087\u0001\u0010\u0015J'\u0010\u008d\u0001\u001a\u00030\u008c\u00012\b\u0010\u0089\u0001\u001a\u00030\u0088\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0013\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0011\u0010\u0092\u0001\u001a\u000202H\u0002¢\u0006\u0005\b\u0092\u0001\u0010:J\u001a\u0010\u0094\u0001\u001a\n\u0012\u0005\u0012\u00030\u008c\u00010\u0093\u0001H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\u0015J\u0011\u0010\u0097\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0097\u0001\u0010\u0015J\u0011\u0010\u0098\u0001\u001a\u00020\u0013H\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0015J\u0011\u0010\u0099\u0001\u001a\u00028\u0000H\u0002¢\u0006\u0005\b\u0099\u0001\u0010<JA\u0010\u009b\u0001\u001a\u00028\u00002\u0007\u0010\u009a\u0001\u001a\u00020\f2\u0006\u0010W\u001a\u00020\u00192\b\u0010X\u001a\u0004\u0018\u00010\f2\b\u0010Y\u001a\u0004\u0018\u00010\u00162\b\u0010Z\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010\u009d\u0001R\u001a\u0010\u009f\u0001\u001a\u00030\u009e\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u009f\u0001\u0010 \u0001R\u0019\u0010¡\u0001\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u001a\u0010¤\u0001\u001a\u00030£\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R\u001b\u0010¦\u0001\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010©\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010¬\u0001\u001a\u00030«\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0019\u0010?\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010®\u0001R\u0019\u0010C\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010¯\u0001R\u0019\u0010T\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010®\u0001R\u0019\u0010V\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bV\u0010¯\u0001R\u001f\u0010±\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00010°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0017\u0010c\u001a\u00020b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bc\u0010³\u0001R\u0017\u0010f\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010´\u0001R\u0017\u0010i\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010´\u0001R\u0017\u0010p\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bp\u0010´\u0001R\u0017\u0010u\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010´\u0001R\u0017\u0010k\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bk\u0010µ\u0001R\u0017\u0010n\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010µ\u0001R\u001b\u0010¶\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010¹\u0001\u001a\u00030¸\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u0019\u0010¾\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010´\u0001R\u0019\u0010¿\u0001\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010´\u0001R\u001a\u0010Á\u0001\u001a\u00030À\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Ä\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u001a\u0010Æ\u0001\u001a\u00030Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Å\u0001R\u0019\u0010Ç\u0001\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010É\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Ë\u0001\u001a\u00020\f8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bË\u0001\u0010È\u0001R\u0019\u0010Ì\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010È\u0001R\u0019\u0010w\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010Í\u0001R\u0019\u0010{\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b{\u0010Î\u0001¨\u0006Ô\u0001"}, d2 = {"Lru/yandex/taxi/widget/dialog/BaseDialog;", CA20Status.STATUS_REQUEST_D, "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Lf32;", "Lnwy0;", "Landroid/app/Activity;", "activity", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/app/Activity;Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/app/Activity;)V", "(Landroid/app/Activity;Landroid/util/AttributeSet;)V", "(Landroid/app/Activity;Landroid/util/AttributeSet;I)V", "Lzy11;", "bindViewsInFields", "()V", "Ljava/lang/Runnable;", "getDismissListener", "()Ljava/lang/Runnable;", "", "getTitle", "()Ljava/lang/CharSequence;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "getCustomView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "onViewCreated", "Le32;", "getAnalyticsContext", "()Le32;", "Lmq31;", "getEventListener", "()Lmq31;", "Llq31;", "eventType", "", "", "", "getEventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "onKeyboardHidden", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchOutside", "onBackPressed", "onAttachedToWindow", "onDetachedFromWindow", "onPreDraw", "()Z", "show", "()Lru/yandex/taxi/widget/dialog/BaseDialog;", "onDialogShown", "dismiss", "title", "setTitle", "(Ljava/lang/CharSequence;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "(I)Lru/yandex/taxi/widget/dialog/BaseDialog;", "titleContentDescription", "(Ljava/lang/CharSequence;Ljava/lang/String;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/graphics/Typeface;", "typeface", "setTitleTypeface", "(Landroid/graphics/Typeface;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "drawableId", "setDialogDrawable", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/widget/ImageView;", "getHeaderImageView", "()Landroid/widget/ImageView;", "setHeaderIcon", "tintColor", "setHeaderIconTintColor", Constants.KEY_MESSAGE, "setMessage", "messageContentDescription", "text", "color", "listener", "analyticsName", "setMainActionButton", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Runnable;Ljava/lang/String;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "(Ljava/lang/CharSequence;Ljava/lang/Runnable;Ljava/lang/String;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "(Ljava/lang/CharSequence;Ljava/lang/Runnable;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "(ILjava/lang/Runnable;Ljava/lang/String;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "(ILjava/lang/Runnable;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "addButton", "Lru/yandex/taxi/widget/dialog/BaseDialog$ButtonsOrientation;", "buttonsOrientation", "setButtonsOrientation", "(Lru/yandex/taxi/widget/dialog/BaseDialog$ButtonsOrientation;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "cancelable", "setCancelable", "(Z)Lru/yandex/taxi/widget/dialog/BaseDialog;", "cancelableOnTouchOutside", "setCancelableOnTouchOutside", "dismissListener", "setDismissListener", "(Ljava/lang/Runnable;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "onHideAnimationEndListener", "setOnHideAnimationEndListener", "dismissOnFragmentDetach", "setDismissOnFragmentDetach", "setParentView", "(Landroid/view/ViewGroup;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "parentRes", "autoDismissOnButtonClick", "setAutoDismissOnButtonClick", "analyticsContext", "setAnalyticsContext", "(Le32;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "Lx42;", "paramsProvider", "setAnalyticsParamsProvider", "(Lx42;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "shouldDismissOnFragmentDetach", "isVisible", "onResume", "onPause", "applyAttrs", "(Landroid/util/AttributeSet;I)V", "inflateView", "addDefaultButton", "reportDialogWithoutButtons", "showButtons", "Ltz4;", "buttonInfo", "Ldl40;", "multiClickHandler", "Landroid/widget/TextView;", "createButton", "(Ltz4;Ldl40;)Landroid/widget/TextView;", "Landroid/widget/LinearLayout$LayoutParams;", "createButtonLayoutParams", "()Landroid/widget/LinearLayout$LayoutParams;", "isTextFitsButtons", "", "getButtons", "()Ljava/util/List;", "runShowAnimation", "runScaleShowAnimation", "runHideAnimation", "self", "buttonType", "setButtonText", "(ILjava/lang/CharSequence;Ljava/lang/Integer;Ljava/lang/Runnable;Ljava/lang/String;)Lru/yandex/taxi/widget/dialog/BaseDialog;", "Landroid/app/Activity;", "Lru/yandex/taxi/design/CardComponent;", "contentContainer", "Lru/yandex/taxi/design/CardComponent;", "imageView", "Landroid/widget/ImageView;", "Lru/yandex/taxi/design/ListHeaderComponent;", "titleView", "Lru/yandex/taxi/design/ListHeaderComponent;", "titleTypeface", "Landroid/graphics/Typeface;", "Lru/yandex/taxi/design/ListTextComponent;", "messageView", "Lru/yandex/taxi/design/ListTextComponent;", "Landroid/widget/LinearLayout;", "buttonsContainer", "Landroid/widget/LinearLayout;", "Ljava/lang/CharSequence;", "Ljava/lang/String;", "", "buttons", "Ljava/util/List;", "Lru/yandex/taxi/widget/dialog/BaseDialog$ButtonsOrientation;", "Z", "Ljava/lang/Runnable;", "parentView", "Landroid/view/ViewGroup;", "Ledj;", "containerAccessibilityDelegate", "Ledj;", "Lmx60;", "onBackPressedCallback", "Lmx60;", "visible", "dismissed", "", "cardRadius", "F", "Lkdc;", "additionalButtonColor", "Lkdc;", "additionalButtonTextColor", "dialogDrawableRes", CA20Status.STATUS_USER_I, "dialogDrawable", "Landroid/graphics/drawable/Drawable;", "headerIcon", "headerIconTintColor", "Le32;", "Lx42;", "Companion", "uz4", "vz4", "ButtonsOrientation", "sz4", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public class BaseDialog<D extends BaseDialog<D>> extends FrameLayout implements ViewTreeObserver.OnPreDrawListener, f32, nwy0 {
    private static final int ABOVE_ALL_Z = 1000;
    private static final int ADDITIONAL_BUTTON = 1;
    public static final lq31 BACK_PRESSED_EVENT;
    public static final lq31 BUTTON_TAPPED_EVENT;
    private static final int MAIN_ACTION_BUTTON = 0;
    private static final float SCALE_RUNNABLE_END_SCALE = 1.0f;
    private static final float SCALE_RUNNABLE_START_SCALE = 1.1f;
    public static final lq31 TOUCH_OUTSIDE_EVENT;
    private static mq31 viewEventListener;
    private final Activity activity;
    private kdc additionalButtonColor;
    private kdc additionalButtonTextColor;
    private e32 analyticsContext;
    private boolean autoDismissOnButtonClick;
    private final List<tz4> buttons;
    private LinearLayout buttonsContainer;
    private ButtonsOrientation buttonsOrientation;
    private boolean cancelable;
    private boolean cancelableOnTouchOutside;
    private float cardRadius;
    private final edj containerAccessibilityDelegate;
    private CardComponent contentContainer;
    private Drawable dialogDrawable;
    private int dialogDrawableRes;
    private Runnable dismissListener;
    private boolean dismissOnFragmentDetach;
    private boolean dismissed;
    private int headerIcon;
    private int headerIconTintColor;
    private ImageView imageView;
    private CharSequence message;
    private String messageContentDescription;
    private ListTextComponent messageView;
    private final mx60 onBackPressedCallback;
    private Runnable onHideAnimationEndListener;
    private x42 paramsProvider;
    private ViewGroup parentView;
    private CharSequence title;
    private String titleContentDescription;
    private Typeface titleTypeface;
    private ListHeaderComponent titleView;
    private boolean visible;
    public static final uz4 Companion = new uz4();
    public static final lq31 SHOWN_EVENT = new nu31();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/widget/dialog/BaseDialog$ButtonsOrientation;", "", "HORIZONTAL", "VERTICAL", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class ButtonsOrientation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ButtonsOrientation[] $VALUES;
        public static final ButtonsOrientation HORIZONTAL;
        public static final ButtonsOrientation VERTICAL;

        static {
            ButtonsOrientation buttonsOrientation = new ButtonsOrientation("HORIZONTAL", 0);
            HORIZONTAL = buttonsOrientation;
            ButtonsOrientation buttonsOrientation2 = new ButtonsOrientation("VERTICAL", 1);
            VERTICAL = buttonsOrientation2;
            ButtonsOrientation[] buttonsOrientationArr = {buttonsOrientation, buttonsOrientation2};
            $VALUES = buttonsOrientationArr;
            $ENTRIES = a.a(buttonsOrientationArr);
        }

        public static ButtonsOrientation valueOf(String str) {
            return (ButtonsOrientation) Enum.valueOf(ButtonsOrientation.class, str);
        }

        public static ButtonsOrientation[] values() {
            return (ButtonsOrientation[]) $VALUES.clone();
        }
    }

    static {
        DialogCloseReason dialogCloseReason = DialogCloseReason.BUTTON_TAPPED;
        int i = 12;
        BUTTON_TAPPED_EVENT = new wms(i);
        DialogCloseReason dialogCloseReason2 = DialogCloseReason.BUTTON_TAPPED;
        BACK_PRESSED_EVENT = new wms(i);
        DialogCloseReason dialogCloseReason3 = DialogCloseReason.BUTTON_TAPPED;
        TOUCH_OUTSIDE_EVENT = new wms(i);
        viewEventListener = new lxn();
    }

    public BaseDialog(Activity activity, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.activity = activity;
        this.buttons = new ArrayList();
        this.buttonsOrientation = ButtonsOrientation.HORIZONTAL;
        this.cancelable = true;
        this.dismissOnFragmentDetach = true;
        this.autoDismissOnButtonClick = true;
        this.dismissListener = new zi(7);
        this.onHideAnimationEndListener = new zi(8);
        this.onBackPressedCallback = new qc(5, this);
        this.additionalButtonColor = new bdc(xng0.controlMinor);
        this.additionalButtonTextColor = new bdc(xng0.textOnControlMinor);
        applyAttrs(attributeSet, i);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        this.parentView = viewGroup;
        int i2 = edj.x;
        this.containerAccessibilityDelegate = tf91.a(viewGroup);
        b.p(this, new sz4(this));
        setClickable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        ViewCompat$Api21Impl.r(this, 1000.0f);
    }

    private final void addDefaultButton() {
        setMainActionButton(mzh0.common_ok, (Runnable) null, (String) null);
        showButtons();
    }

    private final void applyAttrs(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArray = null;
        try {
            typedArray = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.BaseDialog, defStyleAttr, 0);
            this.cardRadius = typedArray.getDimension(c4i0.BaseDialog_dialog_corner_radius, tje.r(mrg0.dialog_default_corner_radius, getContext()));
            int color = typedArray.getColor(c4i0.BaseDialog_dialog_additional_button_color, -1);
            if (color != -1) {
                this.additionalButtonColor = new cdc(color);
            }
            int color2 = typedArray.getColor(c4i0.BaseDialog_dialog_additional_button_text_color, -1);
            if (color2 != -1) {
                this.additionalButtonTextColor = new cdc(color2);
            }
            typedArray.recycle();
        } catch (Throwable th) {
            if (typedArray != null) {
                typedArray.recycle();
            }
            throw th;
        }
    }

    private final TextView createButton(tz4 buttonInfo, dl40 multiClickHandler) {
        ButtonComponent buttonComponent = new ButtonComponent(getContext(), null, 0, 6, null);
        buttonComponent.setButtonSize(2);
        if (buttonInfo.b() != null) {
            buttonComponent.setButtonBackground(buttonInfo.b().intValue());
        } else if (buttonInfo.c() == 1) {
            buttonComponent.setButtonBackground(this.additionalButtonColor);
        } else {
            buttonComponent.setButtonBackground(new bdc(xng0.controlMain));
        }
        if (buttonInfo.c() == 1) {
            buttonComponent.setButtonTitleColor(this.additionalButtonTextColor);
        } else {
            buttonComponent.setButtonTitleColor(new bdc(xng0.textOnControl));
            buttonComponent.setAccent(true);
        }
        buttonComponent.setText(buttonInfo.e());
        buttonComponent.setOnClickListener(new DebounceClickListener(multiClickHandler, new mh3(10, this, buttonInfo)));
        return buttonComponent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createButton$lambda$0(BaseDialog baseDialog, tz4 tz4Var) {
        if (baseDialog.autoDismissOnButtonClick) {
            baseDialog.onBackPressedCallback.h(false);
        }
        if (tz4Var.d() != null) {
            tz4Var.d().run();
            String a = tz4Var.a();
            if (a != null && !evu0.J(a)) {
                udq0.N(baseDialog, tz4Var.a());
            }
        }
        if (baseDialog.autoDismissOnButtonClick) {
            baseDialog.dismiss();
            viewEventListener.d(baseDialog.getAnalyticsContext(), baseDialog.getEventAnalyticsParams(BUTTON_TAPPED_EVENT), DialogCloseReason.BUTTON_TAPPED);
        }
    }

    private final LinearLayout.LayoutParams createButtonLayoutParams() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (this.buttonsOrientation == ButtonsOrientation.HORIZONTAL) {
            layoutParams.weight = 1.0f;
            layoutParams.width = 0;
        }
        return layoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissListener$lambda$0() {
    }

    private final List<TextView> getButtons() {
        ArrayList arrayList = new ArrayList();
        LinearLayout linearLayout = this.buttonsContainer;
        if (linearLayout == null) {
            linearLayout = null;
        }
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            LinearLayout linearLayout2 = this.buttonsContainer;
            if (linearLayout2 == null) {
                linearLayout2 = null;
            }
            View childAt = linearLayout2.getChildAt(i);
            if (childAt instanceof TextView) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private final void inflateView() {
        boolean z = true;
        LayoutInflater.from(getContext()).inflate(sph0.base_dialog, (ViewGroup) this, true);
        int i = ndh0.custom_view;
        WeakHashMap weakHashMap = b.a;
        ViewGroup viewGroup = (ViewGroup) ((View) rp31.d(this, i));
        View customView = getCustomView(viewGroup);
        if (customView != null) {
            viewGroup.addView(customView);
        } else {
            viewGroup.setVisibility(8);
        }
        bindViewsInFields();
        CardComponent cardComponent = this.contentContainer;
        if (cardComponent == null) {
            cardComponent = null;
        }
        cardComponent.setRadius(this.cardRadius);
        int i2 = this.dialogDrawableRes;
        if (i2 != 0) {
            ImageView imageView = this.imageView;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageResource(i2);
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setClipToOutline(true);
        } else {
            Drawable drawable = this.dialogDrawable;
            ImageView imageView3 = this.imageView;
            if (drawable != null) {
                if (imageView3 == null) {
                    imageView3 = null;
                }
                imageView3.setImageDrawable(drawable);
                ImageView imageView4 = this.imageView;
                if (imageView4 == null) {
                    imageView4 = null;
                }
                imageView4.setClipToOutline(true);
            } else {
                if (imageView3 == null) {
                    imageView3 = null;
                }
                imageView3.setVisibility(8);
            }
        }
        CharSequence charSequence = this.title;
        if (charSequence == null || evu0.J(charSequence)) {
            ListHeaderComponent listHeaderComponent = this.titleView;
            if (listHeaderComponent == null) {
                listHeaderComponent = null;
            }
            listHeaderComponent.setVisibility(8);
            z = false;
        } else {
            int i3 = this.headerIcon;
            if (i3 != 0) {
                ListHeaderComponent listHeaderComponent2 = this.titleView;
                if (listHeaderComponent2 == null) {
                    listHeaderComponent2 = null;
                }
                listHeaderComponent2.setLeadImage(i3);
            }
            int i4 = this.headerIconTintColor;
            if (i4 != 0) {
                ListHeaderComponent listHeaderComponent3 = this.titleView;
                if (listHeaderComponent3 == null) {
                    listHeaderComponent3 = null;
                }
                listHeaderComponent3.setLeadTint(i4);
            }
            String str = this.titleContentDescription;
            if (str != null && !evu0.J(str)) {
                ListHeaderComponent listHeaderComponent4 = this.titleView;
                if (listHeaderComponent4 == null) {
                    listHeaderComponent4 = null;
                }
                listHeaderComponent4.setContentDescription(this.titleContentDescription);
            }
            ListHeaderComponent listHeaderComponent5 = this.titleView;
            if (listHeaderComponent5 == null) {
                listHeaderComponent5 = null;
            }
            listHeaderComponent5.setTitle(this.title);
            Typeface typeface = this.titleTypeface;
            if (typeface != null) {
                ListHeaderComponent listHeaderComponent6 = this.titleView;
                if (listHeaderComponent6 == null) {
                    listHeaderComponent6 = null;
                }
                listHeaderComponent6.setTitleTypeface(typeface);
            }
        }
        CharSequence charSequence2 = this.message;
        if (charSequence2 == null || evu0.J(charSequence2)) {
            ListTextComponent listTextComponent = this.messageView;
            (listTextComponent != null ? listTextComponent : null).setVisibility(8);
        } else {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(mrg0.go_design_m_space);
            int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(mrg0.go_design_s_space);
            ListTextComponent listTextComponent2 = this.messageView;
            if (listTextComponent2 == null) {
                listTextComponent2 = null;
            }
            listTextComponent2.setText(this.message);
            ListTextComponent listTextComponent3 = this.messageView;
            if (listTextComponent3 == null) {
                listTextComponent3 = null;
            }
            listTextComponent3.setTextPaddings(dimensionPixelOffset, z ? 0 : dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2);
            String str2 = this.messageContentDescription;
            if (str2 != null && !evu0.J(str2)) {
                ListTextComponent listTextComponent4 = this.messageView;
                (listTextComponent4 != null ? listTextComponent4 : null).setContentDescription(this.messageContentDescription);
            }
        }
        showButtons();
        onViewCreated();
    }

    private final boolean isTextFitsButtons() {
        if (this.buttonsOrientation == ButtonsOrientation.VERTICAL) {
            return true;
        }
        Iterator<TextView> it = getButtons().iterator();
        while (it.hasNext()) {
            if (it.next().getLineCount() > 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onHideAnimationEndListener$lambda$0() {
    }

    private final void reportDialogWithoutButtons() {
        xby.d.j(new DialogWithoutButtonsException("Trying to show dialog without buttons. Dialog's title: " + ((Object) this.title) + ", message: " + ((Object) this.message)));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [ru.yandex.taxi.widget.dialog.BaseDialog$runHideAnimation$1] */
    private final void runHideAnimation() {
        cma1.d(this, mqg0.half_transparent_black, mqg0.transparent, 200L, 20L, new AnimatorListenerAdapter(this) { // from class: ru.yandex.taxi.widget.dialog.BaseDialog$runHideAnimation$1
            final /* synthetic */ BaseDialog<D> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ViewGroup viewGroup;
                edj edjVar;
                Runnable runnable;
                ((BaseDialog) this.this$0).visible = false;
                viewGroup = ((BaseDialog) this.this$0).parentView;
                if (viewGroup == null) {
                    ny61.g("parentView should be attached in onAnimationEnd");
                    return;
                }
                viewGroup.removeView(this.this$0);
                edjVar = ((BaseDialog) this.this$0).containerAccessibilityDelegate;
                edjVar.c(this.this$0);
                runnable = ((BaseDialog) this.this$0).onHideAnimationEndListener;
                runnable.run();
            }
        });
        CardComponent cardComponent = this.contentContainer;
        if (cardComponent == null) {
            cardComponent = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(cardComponent, (Property<CardComponent, Float>) FrameLayout.ALPHA, 1.0f, 0.0f).setDuration(200L);
        CardComponent cardComponent2 = this.contentContainer;
        if (cardComponent2 == null) {
            cardComponent2 = null;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(cardComponent2, (Property<CardComponent, Float>) FrameLayout.TRANSLATION_Y, 0.0f, getResources().getDimension(mrg0.dialog_animation_y_offset)).setDuration(180L);
        CardComponent cardComponent3 = this.contentContainer;
        if (cardComponent3 == null) {
            cardComponent3 = null;
        }
        ObjectAnimator duration3 = ObjectAnimator.ofFloat(cardComponent3, (Property<CardComponent, Float>) FrameLayout.SCALE_X, 1.0f, 0.9f).setDuration(200L);
        CardComponent cardComponent4 = this.contentContainer;
        ObjectAnimator duration4 = ObjectAnimator.ofFloat(cardComponent4 != null ? cardComponent4 : null, (Property<CardComponent, Float>) FrameLayout.SCALE_Y, 1.0f, 0.9f).setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2, duration3, duration4);
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runScaleShowAnimation() {
        vz4 vz4Var = new vz4(this);
        rwt0 rwt0Var = new rwt0();
        rwt0Var.e();
        rwt0Var.c();
        rwt0Var.b(new wz4(vz4Var, this));
        rwt0Var.d();
        rwt0Var.f();
    }

    private final void runShowAnimation() {
        cma1.d(this, mqg0.transparent, mqg0.half_transparent_black, 200L, 0L, null);
        CardComponent cardComponent = this.contentContainer;
        if (cardComponent == null) {
            cardComponent = null;
        }
        cardComponent.setAlpha(0.0f);
        CardComponent cardComponent2 = this.contentContainer;
        if (cardComponent2 == null) {
            cardComponent2 = null;
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(cardComponent2, (Property<CardComponent, Float>) FrameLayout.ALPHA, 0.0f, 1.0f).setDuration(200L);
        CardComponent cardComponent3 = this.contentContainer;
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(cardComponent3 != null ? cardComponent3 : null, (Property<CardComponent, Float>) FrameLayout.TRANSLATION_Y, getResources().getDimension(mrg0.dialog_animation_y_offset), 0.0f).setDuration(180L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(duration, duration2);
        animatorSet.setStartDelay(20L);
        animatorSet.addListener(new AnimatorListenerAdapter(this) { // from class: ru.yandex.taxi.widget.dialog.BaseDialog$runShowAnimation$1
            final /* synthetic */ BaseDialog<D> this$0;

            {
                this.this$0 = this;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                ((BaseDialog) this.this$0).visible = true;
                this.this$0.onDialogShown();
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                this.this$0.runScaleShowAnimation();
            }
        });
        animatorSet.start();
    }

    private final D self() {
        return this;
    }

    private final D setButtonText(int buttonType, CharSequence text, Integer color, Runnable listener, String analyticsName) {
        tz4 tz4Var = new tz4(buttonType, text, color, listener, analyticsName);
        if (this.buttons.isEmpty() || ((tz4) b64.c(1, this.buttons)).c() != 0) {
            this.buttons.add(tz4Var);
        } else {
            List<tz4> list = this.buttons;
            if (buttonType == 0) {
                list.set(list.size() - 1, tz4Var);
            } else {
                list.add(list.size() - 1, tz4Var);
            }
        }
        return self();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnHideAnimationEndListener$lambda$0() {
    }

    public static final void setViewEventListener(mq31 mq31Var) {
        Companion.getClass();
        if (mq31Var == null) {
            viewEventListener = new lxn();
        } else {
            viewEventListener = mq31Var;
        }
    }

    private final void showButtons() {
        String a;
        e32 e32Var;
        dl40 dl40Var = new dl40(0);
        LinearLayout linearLayout = this.buttonsContainer;
        if (linearLayout == null) {
            linearLayout = null;
        }
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = this.buttonsContainer;
        if (linearLayout2 == null) {
            linearLayout2 = null;
        }
        linearLayout2.setOrientation(this.buttonsOrientation == ButtonsOrientation.HORIZONTAL ? 0 : 1);
        LinearLayout linearLayout3 = this.buttonsContainer;
        if (linearLayout3 == null) {
            linearLayout3 = null;
        }
        linearLayout3.setShowDividers(2);
        LinearLayout linearLayout4 = this.buttonsContainer;
        if (linearLayout4 == null) {
            linearLayout4 = null;
        }
        linearLayout4.setDividerDrawable(vng.t(dzg0.dialog_button_divider, getContext()));
        int size = this.buttons.size();
        for (int i = 0; i < size; i++) {
            tz4 tz4Var = this.buttons.get(i);
            TextView createButton = createButton(tz4Var, dl40Var);
            LinearLayout linearLayout5 = this.buttonsContainer;
            if (linearLayout5 == null) {
                linearLayout5 = null;
            }
            linearLayout5.addView(createButton, createButtonLayoutParams());
            if (this.analyticsContext != null && (a = tz4Var.a()) != null && !evu0.J(a) && (e32Var = this.analyticsContext) != null) {
                e32Var.d(tz4Var.a());
            }
        }
    }

    public final D addButton(int text, Runnable listener, String analyticsName) {
        return addButton(getContext().getString(text), listener, analyticsName);
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

    public void bindViewsInFields() {
        int i = ndh0.content_container;
        WeakHashMap weakHashMap = b.a;
        this.contentContainer = (CardComponent) ((View) rp31.d(this, i));
        this.imageView = (ImageView) ((View) rp31.d(this, ndh0.image));
        this.titleView = (ListHeaderComponent) ((View) rp31.d(this, ndh0.title));
        this.messageView = (ListTextComponent) ((View) rp31.d(this, ndh0.message));
        this.buttonsContainer = (LinearLayout) ((View) rp31.d(this, ndh0.buttons));
    }

    public void dismiss() {
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        this.dismissListener.run();
        runHideAnimation();
    }

    @Override // defpackage.f32
    public e32 getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // defpackage.f32
    public q37 getButtonTapsListener() {
        return getEventListener();
    }

    public View getCustomView(ViewGroup parent) {
        return null;
    }

    public final Runnable getDismissListener() {
        return this.dismissListener;
    }

    @Override // defpackage.x42
    public Map<String, Object> getEventAnalyticsParams(lq31 eventType) {
        x42 x42Var = this.paramsProvider;
        if (x42Var != null) {
            return x42Var.getEventAnalyticsParams(eventType);
        }
        return null;
    }

    @Override // defpackage.f32
    public mq31 getEventListener() {
        return viewEventListener;
    }

    public final ImageView getHeaderImageView() {
        ListHeaderComponent listHeaderComponent = this.titleView;
        if (listHeaderComponent == null) {
            listHeaderComponent = null;
        }
        return listHeaderComponent.getLeadImageView();
    }

    @Override // defpackage.f32
    public ohp0 getScrollDirectionListener() {
        return getEventListener();
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this);
        viewEventListener.a(getAnalyticsContext(), getEventAnalyticsParams(SHOWN_EVENT));
        tje.a0(this.activity, this.onBackPressedCallback);
    }

    public void onBackPressed() {
        if (this.cancelable) {
            dismiss();
            viewEventListener.d(getAnalyticsContext(), getEventAnalyticsParams(BACK_PRESSED_EVENT), DialogCloseReason.BACK_PRESSED);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this);
        this.onBackPressedCallback.g();
    }

    public void onDialogShown() {
    }

    public void onKeyboardHidden() {
        requestFocus();
    }

    public void onPause() {
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        if (isTextFitsButtons()) {
            getViewTreeObserver().removeOnPreDrawListener(this);
            runShowAnimation();
            return true;
        }
        setButtonsOrientation(ButtonsOrientation.VERTICAL);
        showButtons();
        return false;
    }

    public void onResume() {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 1) {
            onTouchOutside();
        }
        return super.onTouchEvent(event);
    }

    public void onTouchOutside() {
        if (this.cancelableOnTouchOutside) {
            dismiss();
            viewEventListener.d(getAnalyticsContext(), getEventAnalyticsParams(TOUCH_OUTSIDE_EVENT), DialogCloseReason.TOUCH_OUTSIDE);
        }
    }

    public void onViewCreated() {
        if (getButtons().isEmpty()) {
            reportDialogWithoutButtons();
            addDefaultButton();
        }
    }

    @jxi
    public final D setAnalyticsContext(e32 analyticsContext) {
        this.analyticsContext = analyticsContext;
        return self();
    }

    @jxi
    public final D setAnalyticsParamsProvider(x42 paramsProvider) {
        this.paramsProvider = paramsProvider;
        return self();
    }

    public final D setAutoDismissOnButtonClick(boolean autoDismissOnButtonClick) {
        this.autoDismissOnButtonClick = autoDismissOnButtonClick;
        return self();
    }

    public final D setButtonsOrientation(ButtonsOrientation buttonsOrientation) {
        this.buttonsOrientation = buttonsOrientation;
        return self();
    }

    public final D setCancelable(boolean cancelable) {
        this.cancelable = cancelable;
        return self();
    }

    public final D setCancelableOnTouchOutside(boolean cancelableOnTouchOutside) {
        this.cancelableOnTouchOutside = cancelableOnTouchOutside;
        return self();
    }

    public final D setDialogDrawable(int drawableId) {
        this.dialogDrawableRes = drawableId;
        return self();
    }

    public final D setDismissListener(Runnable dismissListener) {
        this.dismissListener = dismissListener;
        return self();
    }

    public final D setDismissOnFragmentDetach(boolean dismissOnFragmentDetach) {
        this.dismissOnFragmentDetach = dismissOnFragmentDetach;
        return self();
    }

    public final D setHeaderIcon(int drawableId) {
        this.headerIcon = drawableId;
        return self();
    }

    public final D setHeaderIconTintColor(int tintColor) {
        this.headerIconTintColor = getContext().getColor(tintColor);
        return self();
    }

    public final D setMainActionButton(int text, Runnable listener, String analyticsName) {
        return setMainActionButton(getContext().getString(text), listener, analyticsName);
    }

    public final D setMessage(CharSequence message, String messageContentDescription) {
        this.message = message;
        this.messageContentDescription = messageContentDescription;
        if (message != null && (messageContentDescription == null || evu0.J(messageContentDescription))) {
            this.messageContentDescription = message.toString();
        }
        return self();
    }

    public final D setOnHideAnimationEndListener(Runnable onHideAnimationEndListener) {
        if (onHideAnimationEndListener != null) {
            this.onHideAnimationEndListener = onHideAnimationEndListener;
        } else {
            this.onHideAnimationEndListener = new zi(9);
        }
        return self();
    }

    public final D setParentView(int parentRes) {
        return setParentView((ViewGroup) this.activity.findViewById(parentRes));
    }

    public final D setTitle(CharSequence title, String titleContentDescription) {
        this.title = title;
        this.titleContentDescription = titleContentDescription;
        if (title != null && (titleContentDescription == null || evu0.J(titleContentDescription))) {
            this.titleContentDescription = title.toString();
        }
        return self();
    }

    public final D setTitleTypeface(Typeface typeface) {
        this.titleTypeface = typeface;
        return self();
    }

    /* renamed from: shouldDismissOnFragmentDetach, reason: from getter */
    public final boolean getDismissOnFragmentDetach() {
        return this.dismissOnFragmentDetach;
    }

    public final D show() {
        inflateView();
        ViewGroup viewGroup = this.parentView;
        if (viewGroup == null) {
            ny61.g("parentView should be attached before show");
            return null;
        }
        viewGroup.addView(this, -1, -1);
        this.containerAccessibilityDelegate.d(this);
        announceForAccessibility(getResources().getString(R.string.dialog_alert_title));
        xw31.w(this);
        return self();
    }

    public final D setDialogDrawable(Drawable drawable) {
        this.dialogDrawable = drawable;
        return self();
    }

    public final D addButton(CharSequence text, Runnable listener) {
        return setButtonText(1, text, null, listener, null);
    }

    public final D setMainActionButton(CharSequence text, Runnable listener, String analyticsName) {
        return setButtonText(0, text, null, listener, analyticsName);
    }

    public final D setParentView(ViewGroup parent) {
        this.parentView = parent;
        return self();
    }

    public final D addButton(CharSequence text, Runnable listener, String analyticsName) {
        return setButtonText(1, text, null, listener, analyticsName);
    }

    public final D setMainActionButton(CharSequence text, Runnable listener) {
        return setButtonText(0, text, null, listener, null);
    }

    public final D addButton(int text, Runnable listener) {
        return addButton(text, listener, (String) null);
    }

    public final D setMainActionButton(String text, Integer color, Runnable listener, String analyticsName) {
        return setButtonText(0, text, color, listener, analyticsName);
    }

    public final D setMainActionButton(int text, Runnable listener) {
        return setMainActionButton(text, listener, (String) null);
    }

    public D setMessage(CharSequence message) {
        return setMessage(message, null);
    }

    public final D setTitle(int title) {
        return setTitle(getResources().getString(title), null);
    }

    public final D setMessage(int message) {
        return setMessage(getResources().getString(message));
    }

    public D setTitle(CharSequence title) {
        return setTitle(title, null);
    }

    public BaseDialog(Activity activity) {
        this(activity, null);
    }

    public BaseDialog(Activity activity, AttributeSet attributeSet) {
        this(activity, attributeSet, xng0.baseDialogStyle);
    }

    public BaseDialog(Activity activity, AttributeSet attributeSet, int i) {
        this(activity, activity, attributeSet, i);
    }
}
