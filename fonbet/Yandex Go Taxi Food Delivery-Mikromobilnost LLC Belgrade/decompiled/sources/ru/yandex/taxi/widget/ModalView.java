package ru.yandex.taxi.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat$Api21Impl;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a230;
import defpackage.b030;
import defpackage.b230;
import defpackage.c230;
import defpackage.cma1;
import defpackage.d230;
import defpackage.d82;
import defpackage.e030;
import defpackage.e230;
import defpackage.e32;
import defpackage.evu0;
import defpackage.f32;
import defpackage.g18;
import defpackage.g5c;
import defpackage.gtg;
import defpackage.hr31;
import defpackage.i8m;
import defpackage.ir31;
import defpackage.iy2;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k20;
import defpackage.k4o;
import defpackage.kl40;
import defpackage.lq31;
import defpackage.lxn;
import defpackage.mh2;
import defpackage.mq31;
import defpackage.mqg0;
import defpackage.mrg0;
import defpackage.mx60;
import defpackage.nu31;
import defpackage.nwy0;
import defpackage.o430;
import defpackage.ohp0;
import defpackage.pey;
import defpackage.q37;
import defpackage.qje;
import defpackage.qv10;
import defpackage.s45;
import defpackage.sms;
import defpackage.t130;
import defpackage.t1w;
import defpackage.tje;
import defpackage.twn;
import defpackage.u130;
import defpackage.u45;
import defpackage.v130;
import defpackage.vih0;
import defpackage.vng;
import defpackage.vpa;
import defpackage.w130;
import defpackage.w511;
import defpackage.w900;
import defpackage.xby;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.xw31;
import defpackage.xz20;
import defpackage.y130;
import defpackage.zy11;
import defpackage.zz20;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.function.Consumer;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.analytics.ModalViewCloseReason;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 Ó\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006Ô\u0001Õ\u0001Ö\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bB%\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000eJ'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b%\u0010$J\u000f\u0010'\u001a\u00020\fH\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00106\u001a\u00020\u00162\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0017¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u00162\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u00162\u0006\u0010<\u001a\u00020\fH\u0017¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0016H\u0014¢\u0006\u0004\b?\u0010\u0018J\u000f\u0010@\u001a\u00020\fH\u0014¢\u0006\u0004\b@\u0010(J\u0017\u0010C\u001a\u00020\u00162\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020\u00162\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020EH\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\u00162\u0006\u0010K\u001a\u000208H\u0016¢\u0006\u0004\bL\u0010;J\u0017\u0010N\u001a\u00020\u00162\u0006\u0010M\u001a\u000208H\u0016¢\u0006\u0004\bN\u0010;J\u0015\u0010Q\u001a\u00020\u00162\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u0002082\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u0002082\u0006\u0010\u0010\u001a\u00020SH\u0016¢\u0006\u0004\bW\u0010VJ\u000f\u0010X\u001a\u000208H\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u00020\u00162\u0006\u0010Z\u001a\u000208H\u0016¢\u0006\u0004\b[\u0010;J\u0017\u0010]\u001a\u00020\u00162\u0006\u0010\\\u001a\u000208H\u0016¢\u0006\u0004\b]\u0010;J\u0017\u0010_\u001a\u00020\u00162\u0006\u0010^\u001a\u000208H\u0016¢\u0006\u0004\b_\u0010;J\u000f\u0010`\u001a\u00020\u0016H\u0017¢\u0006\u0004\b`\u0010\u0018J\u0019\u0010b\u001a\u00020\u00162\b\u0010a\u001a\u0004\u0018\u00010AH\u0017¢\u0006\u0004\bb\u0010DJ\u000f\u0010c\u001a\u00020\fH\u0016¢\u0006\u0004\bc\u0010(J\u000f\u0010d\u001a\u000208H\u0014¢\u0006\u0004\bd\u0010YJ\u000f\u0010e\u001a\u000208H\u0014¢\u0006\u0004\be\u0010YJ\u0019\u0010g\u001a\u00020\u00162\b\u0010f\u001a\u0004\u0018\u00010AH\u0016¢\u0006\u0004\bg\u0010DJ\u000f\u0010h\u001a\u00020\u0016H\u0015¢\u0006\u0004\bh\u0010\u0018J\u000f\u0010i\u001a\u00020\u0016H\u0015¢\u0006\u0004\bi\u0010\u0018J\u000f\u0010j\u001a\u00020\u0016H\u0014¢\u0006\u0004\bj\u0010\u0018J\u000f\u0010k\u001a\u00020\u0016H\u0014¢\u0006\u0004\bk\u0010\u0018J\u000f\u0010l\u001a\u00020\u0016H\u0014¢\u0006\u0004\bl\u0010\u0018J\r\u0010m\u001a\u00020\u0016¢\u0006\u0004\bm\u0010\u0018J\u000f\u0010n\u001a\u00020\u0016H\u0004¢\u0006\u0004\bn\u0010\u0018J\u000f\u0010o\u001a\u00020\u0016H\u0016¢\u0006\u0004\bo\u0010\u0018J\u001f\u0010o\u001a\u00020\u00162\u0006\u0010p\u001a\u00020A2\u0006\u0010q\u001a\u00020AH\u0014¢\u0006\u0004\bo\u0010rJ\u000f\u0010s\u001a\u00020OH\u0014¢\u0006\u0004\bs\u0010tJ\u000f\u0010v\u001a\u00020uH\u0014¢\u0006\u0004\bv\u0010wJ\u0017\u0010y\u001a\u00020\u00162\u0006\u0010x\u001a\u00020uH\u0014¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u000208H\u0014¢\u0006\u0004\b{\u0010YJ\u0015\u0010~\u001a\u00020\u00162\u0006\u0010}\u001a\u00020|¢\u0006\u0004\b~\u0010\u007fJ\u001e\u0010\u0082\u0001\u001a\u00020\u00162\n\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0019\u0010\u0084\u0001\u001a\u00020\u00162\u0006\u0010}\u001a\u00020|H\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u0019\u0010\u0085\u0001\u001a\u00020\u00162\u0006\u0010c\u001a\u00020\fH\u0015¢\u0006\u0005\b\u0085\u0001\u0010>J\u001a\u0010\u0087\u0001\u001a\u00020\u00162\u0007\u0010\u0086\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b\u0087\u0001\u0010>J\u0011\u0010\u0088\u0001\u001a\u00020\u0016H\u0014¢\u0006\u0005\b\u0088\u0001\u0010\u0018J\u001a\u0010\u008a\u0001\u001a\u00020\u00162\u0007\u0010\u0089\u0001\u001a\u000208H\u0014¢\u0006\u0005\b\u008a\u0001\u0010;J\u0011\u0010\u008b\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u008b\u0001\u0010\u0018J\u001a\u0010\u008d\u0001\u001a\u00020\u00162\u0007\u0010\u008c\u0001\u001a\u000208H\u0016¢\u0006\u0005\b\u008d\u0001\u0010;J\u0011\u0010\u008e\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u008e\u0001\u0010\u0018J\u0011\u0010\u008f\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u0018J\u0015\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0014¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0019\u0010\u0093\u0001\u001a\u00020\u00162\u0006\u0010a\u001a\u00020AH\u0015¢\u0006\u0005\b\u0093\u0001\u0010DJ\u0011\u0010\u0094\u0001\u001a\u00020\u0016H\u0016¢\u0006\u0005\b\u0094\u0001\u0010\u0018J\u0011\u0010\u0095\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u0095\u0001\u0010\u0018J\u0011\u0010\u0096\u0001\u001a\u00020\u0016H\u0015¢\u0006\u0005\b\u0096\u0001\u0010\u0018J!\u0010\u0097\u0001\u001a\u00020\u00162\u0006\u0010p\u001a\u00020A2\u0006\u0010q\u001a\u00020AH\u0014¢\u0006\u0005\b\u0097\u0001\u0010rJ\u001e\u0010\u0099\u0001\u001a\u00020O2\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0080\u0001H\u0014¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u0016H\u0014¢\u0006\u0005\b\u009b\u0001\u0010\u0018J\u0011\u0010\u009c\u0001\u001a\u00020uH\u0014¢\u0006\u0005\b\u009c\u0001\u0010wJ\u0011\u0010\u009d\u0001\u001a\u00020uH\u0014¢\u0006\u0005\b\u009d\u0001\u0010wJ\u001c\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\"\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J\u0011\u0010¡\u0001\u001a\u00020\fH\u0015¢\u0006\u0005\b¡\u0001\u0010(J\u0013\u0010¢\u0001\u001a\u00030\u0090\u0001H$¢\u0006\u0006\b¢\u0001\u0010\u0092\u0001J\u0011\u0010£\u0001\u001a\u00030\u0090\u0001¢\u0006\u0006\b£\u0001\u0010\u0092\u0001J\u0011\u0010¤\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b¤\u0001\u0010(J\u0011\u0010¥\u0001\u001a\u00020\fH\u0016¢\u0006\u0005\b¥\u0001\u0010(J\u0011\u0010¦\u0001\u001a\u000208H\u0016¢\u0006\u0005\b¦\u0001\u0010YJ\u0012\u0010§\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001J\u001c\u0010«\u0001\u001a\u00020\u00162\b\u0010ª\u0001\u001a\u00030©\u0001H\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001c\u0010¯\u0001\u001a\u00030®\u00012\u0007\u0010\u00ad\u0001\u001a\u00020AH\u0016¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001d\u0010²\u0001\u001a\u00020\u00162\t\u0010±\u0001\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0006\b²\u0001\u0010³\u0001J\u0011\u0010´\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b´\u0001\u0010\u0018J\u0011\u0010µ\u0001\u001a\u000208H\u0002¢\u0006\u0005\bµ\u0001\u0010YJ\u0011\u0010¶\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b¶\u0001\u0010\u0018J\u0011\u0010·\u0001\u001a\u00020\u0016H\u0002¢\u0006\u0005\b·\u0001\u0010\u0018R\u0017\u0010K\u001a\u0002088\u0004@\u0004X\u0085\u000e¢\u0006\u0007\n\u0005\bK\u0010¸\u0001R\u0017\u0010M\u001a\u0002088\u0004@\u0004X\u0085\u000e¢\u0006\u0007\n\u0005\bM\u0010¸\u0001R\u0019\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010¹\u0001R\u0017\u0010\\\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\\\u0010¸\u0001R\u0017\u0010^\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b^\u0010¸\u0001R\u0017\u0010Z\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010¸\u0001R\u0019\u0010º\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010¸\u0001R\u0019\u0010»\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¸\u0001R\u0019\u0010µ\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¸\u0001R\u0019\u0010¼\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010¸\u0001R\u0017\u00109\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b9\u0010¸\u0001R\u0017\u0010F\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010½\u0001R\u0017\u0010P\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010¾\u0001R\u001b\u0010¿\u0001\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0001\u0010À\u0001R\u0019\u0010f\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bf\u0010Á\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010Â\u0001R\u001c\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0001\u0010Ã\u0001R\u0017\u0010Ä\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Á\u0001R\u0017\u0010Å\u0001\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Á\u0001R\u0017\u0010<\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b<\u0010Æ\u0001R\u0017\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bB\u0010Á\u0001R\u0017\u0010Ç\u0001\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010È\u0001R\u001c\u0010Ê\u0001\u001a\u0005\u0018\u00010É\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u0018\u0010Í\u0001\u001a\u00030Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010Î\u0001R\u0017\u0010Ñ\u0001\u001a\u00020!8TX\u0094\u0004¢\u0006\b\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0016\u0010Ò\u0001\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010Y¨\u0006×\u0001"}, d2 = {"Lru/yandex/taxi/widget/ModalView;", "Landroid/widget/FrameLayout;", "Lnwy0;", "Lu45;", "Lf32;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Llq31;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "", "", "", "eventAnalyticsParams", "(Llq31;)Ljava/util/Map;", "Lzy11;", "fixReused", "()V", "Le230;", "insetsType", "()Le230;", "insetsTypeInternal$design_components", "insetsTypeInternal", "Lu130;", "attachInsetsHandler", "()Lu130;", "Lt1w;", "insets", "onInsetsHandled", "(Lt1w;)V", "onInsetsHandledInternal$design_components", "onInsetsHandledInternal", "getStatusBarHeight", "()I", "Lmq31;", "getEventListener", "()Lmq31;", "Le32;", "getAnalyticsContext", "()Le32;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "getPreDrawListener", "()Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Landroid/view/ViewGroup;", "parent", "", "zOrder", "show", "(Landroid/view/ViewGroup;F)V", "", "enableBackgroundOnAppearing", "setEnableBackgroundOnAppearing", "(Z)V", "topOffset", "setTopHostOffset", "(I)V", "applyTopOffset", "getTopHostOffset", "Ljava/lang/Runnable;", "onBackPressedListener", "setOnBackPressedListener", "(Ljava/lang/Runnable;)V", "Ls45;", "onAppearingListener", "setOnAppearingListener", "(Ls45;)V", "getOnAppearingListener", "()Ls45;", "animateOnAppearing", "setAnimateOnAppearing", "animateOnDismissing", "setAnimateOnDismissing", "Lmh2;", "animationDelegate", "setAnimationDelegate", "(Lmh2;)V", "Landroid/view/MotionEvent;", "ev", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "getInterceptOnBackPress", "()Z", "interceptOnBackPress", "setInterceptOnBackPress", "dismissOnTouchOutside", "setDismissOnTouchOutside", "dismissOnBackPressed", "setDismissOnBackPressed", "dismiss", "onAnimationEnd", "dismissWithAction", "contentTop", "onPreDrawReadyToAnimate", "shouldDismissOnTouchOutside", "onTouchOutsideListener", "setOnTouchOutsideListener", "onTouchOutside", "onBackPressed", "onDismissManually", "onAttachedToWindow", "onDetachedFromWindow", "forceApplyInsets", "removeOnPreDrawListener", "animateShow", "startAction", "endAction", "(Ljava/lang/Runnable;Ljava/lang/Runnable;)V", "getAppearAnimationDelegate", "()Lmh2;", "", "appearAnimationDuration", "()J", "duration", "animateShowBackground", "(J)V", "isTransiting", "Lru/yandex/taxi/widget/ModalView$TransitionType;", "transitionType", "onTransitionStart", "(Lru/yandex/taxi/widget/ModalView$TransitionType;)V", "Lg5c;", "closeReason", "setCloseTransitionReason", "(Lg5c;)V", "onTransitionEnd", "onModalViewAppear", "visibility", "setVisibility", "updateUserInteractionBlockingOutside", "block", "setBlockUserInteractionOutside", "onAppearAnimationComplete", "focusableInTouchMode", "setFocusableInTouchMode", "onModalViewDisappear", "performAccessibilityFocusAction", "Landroid/view/View;", "getFocusedForAccessibilityViewOnAppear", "()Landroid/view/View;", "dismissInternal", "dismissWithoutAnimation", "dismissInternalWithoutAnimation", "removeFromParent", "animateDismiss", "closeTransitionReason", "getDismissAnimationDelegate", "(Lg5c;)Lmh2;", "animateDismissBackground", "dismissAnimationDuration", "defaultAnimationDuration", "Landroid/view/WindowInsets;", "dispatchApplyWindowInsets", "(Landroid/view/WindowInsets;)Landroid/view/WindowInsets;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "contentView", "contentViewInternal", "getContentHeight", "getContentViewHeight", "canHandleScreenTracking", "screenName", "()Ljava/lang/String;", "Lpey;", "lifecycleOwner", "setLifecycleOwner", "(Lpey;)V", "action", "Lg18;", "addOnDetachAction", "(Ljava/lang/Runnable;)Lg18;", "analyticsContext", "setAnalyticsContext", "(Le32;)V", "init", "blockUserInteractionOutside", "disableModalOnDismiss", "dismissInternalNow", "Z", "Lru/yandex/taxi/widget/ModalView$TransitionType;", "dismissing", "defaultFocusableInTouchMode", "isBackgroundVisibleState", "Ls45;", "Lmh2;", "onPreDrawListener", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "Ljava/lang/Runnable;", "Le32;", "Lg5c;", "onAnimateShowStartAction", "onAnimateShowEndAction", CA20Status.STATUS_USER_I, "insetsHandler", "Lu130;", "Lru/yandex/taxi/theme/ThemeType;", "lastThemeTypeWhenDetached", "Lru/yandex/taxi/theme/ThemeType;", "Lmx60;", "onBackPressedCallback", "Lmx60;", "getCurrentInsets", "()Lt1w;", "currentInsets", "isBackgroundVisible", "Companion", "e030", "b030", "TransitionType", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class ModalView extends FrameLayout implements nwy0, u45, f32 {
    public static final lq31 BACK_PRESSED_EVENT;
    public static final s45 EMPTY_APPEARING_LISTENER;
    public static final lq31 TOUCH_OUTSIDE_EVENT;
    public static mq31 viewEventListener;
    private e32 analyticsContext;
    protected boolean animateOnAppearing;
    protected boolean animateOnDismissing;
    private mh2 animationDelegate;
    private boolean blockUserInteractionOutside;
    private g5c closeTransitionReason;
    private boolean defaultFocusableInTouchMode;
    private boolean dismissOnBackPressed;
    private boolean dismissOnTouchOutside;
    private boolean dismissing;
    private boolean enableBackgroundOnAppearing;
    private final u130 insetsHandler;
    private boolean interceptOnBackPress;
    private boolean isBackgroundVisibleState;
    private ThemeType lastThemeTypeWhenDetached;
    private final Runnable onAnimateShowEndAction;
    private final Runnable onAnimateShowStartAction;
    private s45 onAppearingListener;
    private final mx60 onBackPressedCallback;
    private Runnable onBackPressedListener;
    private ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    private Runnable onTouchOutsideListener;
    private int topOffset;
    private TransitionType transitionType;
    public static final e030 Companion = new e030();
    public static final lq31 SHOWN_EVENT = new nu31();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/widget/ModalView$TransitionType;", "", "APPEAR", "DISAPPEAR", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class TransitionType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ TransitionType[] $VALUES;
        public static final TransitionType APPEAR;
        public static final TransitionType DISAPPEAR;

        static {
            TransitionType transitionType = new TransitionType("APPEAR", 0);
            APPEAR = transitionType;
            TransitionType transitionType2 = new TransitionType("DISAPPEAR", 1);
            DISAPPEAR = transitionType2;
            TransitionType[] transitionTypeArr = {transitionType, transitionType2};
            $VALUES = transitionTypeArr;
            $ENTRIES = kotlin.enums.a.a(transitionTypeArr);
        }

        public static TransitionType valueOf(String str) {
            return (TransitionType) Enum.valueOf(TransitionType.class, str);
        }

        public static TransitionType[] values() {
            return (TransitionType[]) $VALUES.clone();
        }
    }

    static {
        ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.BACK_PRESSED;
        int i = 11;
        BACK_PRESSED_EVENT = new sms(i);
        ModalViewCloseReason modalViewCloseReason2 = ModalViewCloseReason.BACK_PRESSED;
        TOUCH_OUTSIDE_EVENT = new sms(i);
        EMPTY_APPEARING_LISTENER = new twn();
        viewEventListener = new lxn();
    }

    public ModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animateOnAppearing = true;
        this.animateOnDismissing = true;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.defaultFocusableInTouchMode = true;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.animationDelegate = o430.b;
        this.onAnimateShowStartAction = new zz20(this, 0);
        this.onAnimateShowEndAction = new zz20(this, 1);
        this.onBackPressedListener = new vpa(15);
        this.insetsHandler = attachInsetsHandler();
        this.onBackPressedCallback = new w900(this);
        init();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateDismiss$lambda$0$0(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateDismiss$lambda$0$1(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0$0(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 animateShow$lambda$0$1(Runnable runnable) {
        runnable.run();
        return zy11.a;
    }

    private final boolean blockUserInteractionOutside() {
        if (!this.blockUserInteractionOutside) {
            return false;
        }
        Rect rect = xw31.a;
        return getVisibility() == 0;
    }

    private final void disableModalOnDismiss() {
        clearFocus();
        Object systemService = getContext().getSystemService("input_method");
        InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
        setEnabled(false);
        setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissInternal$lambda$1(ModalView modalView, Runnable runnable) {
        modalView.dismissInternalNow();
        runnable.run();
    }

    private final void dismissInternalNow() {
        if (getParent() == null || this.dismissing) {
            return;
        }
        this.dismissing = true;
        removeFromParent();
        onModalViewDisappear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dismissWithAction$lambda$0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getPreDrawListener$lambda$0(ModalView modalView) {
        if (!modalView.onPreDrawReadyToAnimate()) {
            return false;
        }
        modalView.removeOnPreDrawListener();
        if (modalView.transitionType != null) {
            return true;
        }
        modalView.animateShow(modalView.onAnimateShowStartAction, modalView.onAnimateShowEndAction);
        return true;
    }

    private final void init() {
        setTopHostOffset(this.topOffset);
        setElevation(getContext().getResources().getDimensionPixelSize(mrg0.modal_view_default_elevation));
        setClickable(true);
        androidx.core.view.b.p(this, new b030(this));
        setImportantForAccessibility(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAnimateShowStartAction$lambda$0(ModalView modalView) {
        modalView.onModalViewAppear(modalView.contentTop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedListener$lambda$0() {
    }

    public static final void setViewEventListener(mq31 mq31Var) {
        Companion.getClass();
        if (mq31Var == null) {
            mq31Var = new lxn();
        }
        viewEventListener = mq31Var;
    }

    @Override // defpackage.u45
    public g18 addOnDetachAction(final Runnable action) {
        if (!isAttachedToWindow()) {
            action.run();
            return g18.u1;
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.design.utils.ViewExtensionsKt$doOnDetachCancelable$listener$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.removeOnAttachStateChangeListener(this);
                action.run();
            }
        };
        addOnAttachStateChangeListener(onAttachStateChangeListener);
        return new k20(9, this, onAttachStateChangeListener);
    }

    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    public void animateDismiss(Runnable startAction, Runnable endAction) {
        animateDismissBackground();
        View content = getContent();
        if (content.getHeight() == 0) {
            startAction.run();
            endAction.run();
        } else {
            getDismissAnimationDelegate(this.closeTransitionReason).m(content, new gtg(3, startAction), new gtg(4, endAction), dismissAnimationDuration());
        }
    }

    public void animateDismissBackground() {
        if (this.isBackgroundVisibleState) {
            this.isBackgroundVisibleState = false;
            cma1.d(this, getBackgroundColor(), mqg0.transparent, dismissAnimationDuration(), 0L, null);
        }
    }

    public void animateShow(Runnable startAction, Runnable endAction) {
        View content = getContent();
        long appearAnimationDuration = appearAnimationDuration();
        if (content.getHeight() == 0) {
            startAction.run();
        } else {
            getAppearAnimationDelegate().g(content, new gtg(1, startAction), new gtg(2, endAction), appearAnimationDuration);
        }
        if (this.enableBackgroundOnAppearing) {
            animateShowBackground(appearAnimationDuration);
        }
    }

    public void animateShowBackground(long duration) {
        if (this.isBackgroundVisibleState) {
            return;
        }
        this.isBackgroundVisibleState = true;
        cma1.d(this, mqg0.transparent, getBackgroundColor(), duration, 0L, null);
    }

    public long appearAnimationDuration() {
        return defaultAnimationDuration();
    }

    public /* bridge */ void applyTheme(ThemeType themeType) {
    }

    public /* bridge */ boolean applyThemeForChildrenByDefault() {
        return true;
    }

    public void applyTopOffset() {
        OneShotPreDrawListener.add(this, new i8m(27, this));
    }

    public u130 attachInsetsHandler() {
        return new u130(this);
    }

    /* renamed from: backgroundColor */
    public int getBackgroundColor() {
        return mqg0.component_black_opacity_45;
    }

    public boolean canHandleScreenTracking() {
        return false;
    }

    public int contentTop() {
        return getContent().getTop();
    }

    /* renamed from: contentView */
    public abstract View getContent();

    public final View contentViewInternal() {
        return getContent();
    }

    public long defaultAnimationDuration() {
        return 200L;
    }

    public void dismiss() {
        dismissWithAction(null);
    }

    public long dismissAnimationDuration() {
        return defaultAnimationDuration();
    }

    public void dismissInternal(Runnable onAnimationEnd) {
        disableModalOnDismiss();
        this.onAppearingListener.c();
        animateDismiss(new zz20(this, 2), new iy2(23, this, onAnimationEnd));
    }

    public void dismissInternalWithoutAnimation() {
        disableModalOnDismiss();
        this.onAppearingListener.c();
        dismissInternalNow();
    }

    public void dismissWithAction(Runnable onAnimationEnd) {
        if (onAnimationEnd == null) {
            onAnimationEnd = new d82(2);
        }
        dismissInternal(onAnimationEnd);
    }

    @Override // defpackage.u45
    public void dismissWithoutAnimation() {
        dismissInternalWithoutAnimation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        super.dispatchApplyWindowInsets(insets);
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (this.transitionType != null) {
            return true;
        }
        try {
            return super.dispatchTouchEvent(ev);
        } catch (NullPointerException e) {
            String message = e.getMessage();
            if (message == null || !evu0.y(message, "void android.view.VelocityTracker.clear()", false)) {
                throw e;
            }
            xby.d.j(new RuntimeException(qv10.l(this.getClass(), "ignored NPE on VelocityTracker.clear() in "), e));
            return false;
        }
    }

    public final Map<String, Object> eventAnalyticsParams(lq31 event) {
        return getEventAnalyticsParams(event);
    }

    public final void fixReused() {
        this.dismissing = false;
        setEnabled(true);
        setClickable(true);
    }

    public final void forceApplyInsets() {
        u130 u130Var = this.insetsHandler;
        u130Var.getClass();
        t1w t1wVar = t1w.h;
        u130Var.b = t1wVar;
        u130Var.c = t1wVar;
        requestApplyInsets();
    }

    public e32 getAnalyticsContext() {
        return this.analyticsContext;
    }

    public mh2 getAppearAnimationDelegate() {
        return this.animateOnAppearing ? this.animationDelegate : kl40.b;
    }

    @Override // defpackage.f32
    public q37 getButtonTapsListener() {
        return getEventListener();
    }

    public int getContentHeight() {
        return getContent().getHeight();
    }

    public int getContentViewHeight() {
        return getContent().getHeight();
    }

    public t1w getCurrentInsets() {
        return this.insetsHandler.b;
    }

    public mh2 getDismissAnimationDelegate(g5c closeTransitionReason) {
        return this.animateOnDismissing ? this.animationDelegate : kl40.b;
    }

    @jxi
    public /* bridge */ Map<String, Object> getEventAnalyticsParams(lq31 lq31Var) {
        return null;
    }

    @Override // defpackage.f32
    public mq31 getEventListener() {
        return viewEventListener;
    }

    public View getFocusedForAccessibilityViewOnAppear() {
        return null;
    }

    @Override // defpackage.u45
    public boolean getInterceptOnBackPress() {
        return this.interceptOnBackPress;
    }

    @Override // defpackage.u45
    public s45 getOnAppearingListener() {
        return this.onAppearingListener;
    }

    public ViewTreeObserver.OnPreDrawListener getPreDrawListener() {
        return new xz20(0, this);
    }

    @Override // defpackage.f32
    public ohp0 getScrollDirectionListener() {
        return getEventListener();
    }

    public int getStatusBarHeight() {
        return getCurrentInsets().b;
    }

    /* renamed from: getTopHostOffset, reason: from getter */
    public int getTopOffset() {
        return this.topOffset;
    }

    public e230 insetsType() {
        return new c230(false);
    }

    public final e230 insetsTypeInternal$design_components() {
        return insetsType();
    }

    /* renamed from: isBackgroundVisible, reason: from getter */
    public boolean getIsBackgroundVisibleState() {
        return this.isBackgroundVisibleState;
    }

    public boolean isTransiting() {
        return this.transitionType != null;
    }

    public void onAppearAnimationComplete() {
        viewEventListener.a(this.analyticsContext, eventAnalyticsParams(SHOWN_EVENT));
        if (blockUserInteractionOutside()) {
            performAccessibilityFocusAction();
        }
        if (this.defaultFocusableInTouchMode) {
            super.setFocusableInTouchMode(true);
        }
        if (!getRootView().hasFocus() || hasFocus()) {
            return;
        }
        requestFocus();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.onPreDrawListener = getPreDrawListener();
        getViewTreeObserver().addOnPreDrawListener(this.onPreDrawListener);
        tje.a0(getContext(), this.onBackPressedCallback);
        u130 u130Var = this.insetsHandler;
        e230 insetsTypeInternal$design_components = u130Var.e().insetsTypeInternal$design_components();
        int i = 1;
        if (insetsTypeInternal$design_components instanceof c230) {
            u130Var.b((c230) insetsTypeInternal$design_components);
        } else if (insetsTypeInternal$design_components instanceof v130) {
            u130Var.d((v130) insetsTypeInternal$design_components);
        } else if (insetsTypeInternal$design_components instanceof d230) {
            u130Var.c((d230) insetsTypeInternal$design_components);
        } else if (insetsTypeInternal$design_components instanceof y130) {
            y130 y130Var = (y130) insetsTypeInternal$design_components;
            u130Var.a(y130Var, new t130(i, y130Var, u130Var.e()));
        } else if (insetsTypeInternal$design_components instanceof a230) {
            a230 a230Var = (a230) insetsTypeInternal$design_components;
            u130Var.a(a230Var, new t130(0, a230Var, u130Var.e()));
        } else if (insetsTypeInternal$design_components instanceof w130) {
            u130Var.a(insetsTypeInternal$design_components, ((w130) insetsTypeInternal$design_components).c);
        } else if (!jl40.l(insetsTypeInternal$design_components, b230.a)) {
            w511.b();
            return;
        }
        requestApplyInsets();
        ThemeType X = qje.X(getContext());
        ThemeType themeType = this.lastThemeTypeWhenDetached;
        if (themeType == null || themeType == X) {
            return;
        }
        this.lastThemeTypeWhenDetached = null;
        final int u = qje.u(getContext().getTheme(), xng0.bgMain);
        xvy0.b(this, X, true, new Consumer() { // from class: a030
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                xvy0.a(u, (View) obj);
            }
        });
    }

    public void onBackPressed() {
        ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.BACK_PRESSED;
        setCloseTransitionReason(modalViewCloseReason);
        Map<String, Object> eventAnalyticsParams = eventAnalyticsParams(BACK_PRESSED_EVENT);
        viewEventListener.b(this.analyticsContext, eventAnalyticsParams);
        if (this.dismissOnBackPressed) {
            viewEventListener.d(this.analyticsContext, eventAnalyticsParams, modalViewCloseReason);
            onDismissManually();
            dismiss();
        }
        this.onBackPressedListener.run();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getContent().animate().setListener(null).cancel();
        removeOnPreDrawListener();
        this.onBackPressedCallback.g();
        this.lastThemeTypeWhenDetached = qje.X(getContext());
    }

    public void onDismissManually() {
    }

    public void onInsetsHandled(t1w insets) {
    }

    public final void onInsetsHandledInternal$design_components(t1w insets) {
        onInsetsHandled(insets);
    }

    public void onModalViewAppear(int contentTop) {
        this.onAppearingListener.a(contentTop);
        updateUserInteractionBlockingOutside();
    }

    public void onModalViewDisappear() {
        this.onAppearingListener.b();
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
    }

    public boolean onPreDrawReadyToAnimate() {
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == 1) {
            onTouchOutside();
        }
        return super.onTouchEvent(event);
    }

    public void onTouchOutside() {
        ModalViewCloseReason modalViewCloseReason = ModalViewCloseReason.TOUCH_OUTSIDE;
        setCloseTransitionReason(modalViewCloseReason);
        Map<String, Object> eventAnalyticsParams = eventAnalyticsParams(TOUCH_OUTSIDE_EVENT);
        viewEventListener.getClass();
        Runnable runnable = this.onTouchOutsideListener;
        if (runnable != null) {
            runnable.run();
        }
        if (this.dismissOnTouchOutside) {
            viewEventListener.d(this.analyticsContext, eventAnalyticsParams, modalViewCloseReason);
            onDismissManually();
            dismiss();
        }
    }

    public void onTransitionEnd(TransitionType transitionType) {
        if (transitionType == TransitionType.APPEAR) {
            onAppearAnimationComplete();
            if (this.enableBackgroundOnAppearing) {
                setBackgroundColor(getContext().getColor(getBackgroundColor()));
            }
        }
        if (transitionType == TransitionType.DISAPPEAR) {
            if (this.enableBackgroundOnAppearing) {
                setBackgroundColor(getContext().getColor(mqg0.transparent));
            }
            g5c g5cVar = this.closeTransitionReason;
            if (g5cVar != null) {
                viewEventListener.d(this.analyticsContext, eventAnalyticsParams(new sms(11)), g5cVar);
            }
        }
        this.transitionType = null;
    }

    public final void onTransitionStart(TransitionType transitionType) {
        this.transitionType = transitionType;
    }

    @Override // defpackage.u45
    public void performAccessibilityFocusAction() {
        View focusedForAccessibilityViewOnAppear = getFocusedForAccessibilityViewOnAppear();
        if (focusedForAccessibilityViewOnAppear != null) {
            focusedForAccessibilityViewOnAppear.performAccessibilityAction(64, null);
        }
    }

    public void removeFromParent() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final void removeOnPreDrawListener() {
        getViewTreeObserver().removeOnPreDrawListener(this.onPreDrawListener);
    }

    /* renamed from: screenName */
    public String getModalScreenName() {
        return "#none#";
    }

    @jxi
    public final void setAnalyticsContext(e32 analyticsContext) {
        this.analyticsContext = analyticsContext;
    }

    public void setAnimateOnAppearing(boolean animateOnAppearing) {
        this.animateOnAppearing = animateOnAppearing;
    }

    public void setAnimateOnDismissing(boolean animateOnDismissing) {
        this.animateOnDismissing = animateOnDismissing;
    }

    public final void setAnimationDelegate(mh2 animationDelegate) {
        this.animationDelegate = animationDelegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBlockUserInteractionOutside(boolean block) {
        boolean z;
        if (block) {
            Rect rect = xw31.a;
            if (getVisibility() == 0) {
                z = true;
                if (this.blockUserInteractionOutside != z) {
                    return;
                }
                this.blockUserInteractionOutside = block;
                if (isLaidOut() && z) {
                    performAccessibilityFocusAction();
                    return;
                }
                return;
            }
        }
        z = false;
        if (this.blockUserInteractionOutside != z) {
        }
    }

    public void setCloseTransitionReason(g5c closeReason) {
        this.closeTransitionReason = closeReason;
    }

    @Override // defpackage.u45
    public void setDismissOnBackPressed(boolean dismissOnBackPressed) {
        this.dismissOnBackPressed = dismissOnBackPressed;
    }

    public void setDismissOnTouchOutside(boolean dismissOnTouchOutside) {
        this.dismissOnTouchOutside = dismissOnTouchOutside;
    }

    public final void setEnableBackgroundOnAppearing(boolean enableBackgroundOnAppearing) {
        this.enableBackgroundOnAppearing = enableBackgroundOnAppearing;
    }

    @Override // android.view.View
    public void setFocusableInTouchMode(boolean focusableInTouchMode) {
        this.defaultFocusableInTouchMode = false;
        super.setFocusableInTouchMode(focusableInTouchMode);
    }

    public void setInterceptOnBackPress(boolean interceptOnBackPress) {
        this.interceptOnBackPress = interceptOnBackPress;
        this.onBackPressedCallback.h(interceptOnBackPress);
    }

    @Override // defpackage.u45
    public void setLifecycleOwner(pey lifecycleOwner) {
        vng.E(this, lifecycleOwner);
    }

    @Override // defpackage.u45
    public void setOnAppearingListener(s45 onAppearingListener) {
        this.onAppearingListener = onAppearingListener;
    }

    public void setOnBackPressedListener(Runnable onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }

    public void setOnTouchOutsideListener(Runnable onTouchOutsideListener) {
        this.onTouchOutsideListener = onTouchOutsideListener;
    }

    public void setTopHostOffset(int topOffset) {
        if (this.topOffset == topOffset) {
            return;
        }
        this.topOffset = topOffset;
        applyTopOffset();
    }

    @Override // android.view.View
    public void setVisibility(int visibility) {
        super.setVisibility(visibility);
        setBlockUserInteractionOutside(this.blockUserInteractionOutside);
    }

    /* renamed from: shouldDismissOnTouchOutside, reason: from getter */
    public boolean getDismissOnTouchOutside() {
        return this.dismissOnTouchOutside;
    }

    public void show(ViewGroup parent, float zOrder) {
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        ViewCompat$Api21Impl.r(this, zOrder);
        WindowInsets windowInsets = ir31.a;
        if (Build.VERSION.SDK_INT < 30) {
            View.OnApplyWindowInsetsListener hr31Var = new hr31();
            parent.setTag(vih0.tag_compat_insets_dispatch, hr31Var);
            parent.setOnApplyWindowInsetsListener(hr31Var);
            ir31.b = true;
        }
        ViewParent parent2 = getParent();
        if (parent2 instanceof ViewGroup) {
            if (parent2 == parent) {
                xby.d.w(new IllegalStateException(qv10.l(getClass(), "ModalView was not detached from same parent, ModalView name: ")));
            } else {
                xby.d.w(new IllegalStateException(qv10.l(getClass(), "ModalView was not detached from another parent, ModalView name: ")));
            }
            ((ViewGroup) parent2).removeView(this);
        }
        parent.addView(this);
        this.onAppearingListener.d();
    }

    public void updateUserInteractionBlockingOutside() {
        setBlockUserInteractionOutside(true);
    }

    public void animateShow() {
        animateShow(this.onAnimateShowStartAction, this.onAnimateShowEndAction);
    }

    public ModalView(Context context) {
        super(context);
        this.animateOnAppearing = true;
        this.animateOnDismissing = true;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.defaultFocusableInTouchMode = true;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.animationDelegate = o430.b;
        this.onAnimateShowStartAction = new zz20(this, 0);
        this.onAnimateShowEndAction = new zz20(this, 1);
        this.onBackPressedListener = new d82(3);
        this.insetsHandler = attachInsetsHandler();
        this.onBackPressedCallback = new w900(this);
        init();
    }

    public ModalView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.animateOnAppearing = true;
        this.animateOnDismissing = true;
        this.dismissOnTouchOutside = true;
        this.dismissOnBackPressed = true;
        this.interceptOnBackPress = true;
        this.defaultFocusableInTouchMode = true;
        this.enableBackgroundOnAppearing = true;
        this.onAppearingListener = EMPTY_APPEARING_LISTENER;
        this.animationDelegate = o430.b;
        this.onAnimateShowStartAction = new zz20(this, 0);
        this.onAnimateShowEndAction = new zz20(this, 1);
        this.onBackPressedListener = new d82(3);
        this.insetsHandler = attachInsetsHandler();
        this.onBackPressedCallback = new w900(this);
        init();
    }
}
