package com.anythink.expressad.h;

import android.text.TextUtils;
import com.anythink.expressad.reward.a.d;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19953a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f19954b = 2000;

    /* renamed from: c, reason: collision with root package name */
    public static final int f19955c = 3000;

    /* renamed from: d, reason: collision with root package name */
    public static final int f19956d = 3000;

    /* renamed from: e, reason: collision with root package name */
    public static final int f19957e = 5000;

    /* renamed from: f, reason: collision with root package name */
    public static final int f19958f = 6000;

    /* renamed from: g, reason: collision with root package name */
    private static final int f19959g = 600;

    /* renamed from: h, reason: collision with root package name */
    private static final int f19960h = 700;
    private static final int i = 800;

    /* renamed from: j, reason: collision with root package name */
    private static final int f19961j = 900;

    private static int a(int i4) {
        return i4 + 900;
    }

    private static int a(int i4, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                if (str.startsWith("errorCode: ") && str.length() > 16) {
                    return Integer.parseInt(str.substring(11, 15));
                }
                if (str.equals("do not have sorceList")) {
                    return i4 + 601;
                }
                if (str.equals("Network error,UnknownHostException")) {
                    return i4 + 602;
                }
                if (str.equals("v3 is timeout")) {
                    return i4 + 603;
                }
                if (!str.equals("Current unit is loading!") && !str.equals("current unit is loading")) {
                    if (str.equals("Network error,I/O exception response null")) {
                        return i4 + 605;
                    }
                    if (str.equals("Network error,ConnectException")) {
                        return i4 + 606;
                    }
                    if (str.equals("Network error,socket timeout exception")) {
                        return i4 + 607;
                    }
                    if (str.equals("Network error,disconnected network exception")) {
                        return i4 + 608;
                    }
                    if (str.equals("Network error,timeout exception")) {
                        return i4 + 609;
                    }
                    if (str.startsWith("Network error,please check state code")) {
                        return i4 + 610;
                    }
                    if (str.equals("Network error,I/O exception contents null")) {
                        return i4 + 611;
                    }
                    if (str.equals("Network unknown error")) {
                        return i4 + 612;
                    }
                    if (str.equals("Network error,I/O exception")) {
                        return i4 + 613;
                    }
                    if (str.equals("web env is not support")) {
                        return i4 + 614;
                    }
                    if (str.equals("Network error,unknown")) {
                        return i4 + 615;
                    }
                    if (str.equals("Network error，sslp exception")) {
                        return i4 + 616;
                    }
                    if (str.startsWith("Cast exception, return data")) {
                        return i4 + 617;
                    }
                    if (str.equals("REQUEST_TIMEOUT")) {
                        return i4 + 701;
                    }
                    if (str.startsWith("The server returns an exception")) {
                        return i4 + 702;
                    }
                    if (!str.equals(d.f20392a) && !str.equals("Need show campaign list is NULL!")) {
                        if (str.startsWith("load no ad")) {
                            return i4 + 704;
                        }
                        if (str.equals("EXCEPTION_UNIT_NOT_FOUND_IN_APP")) {
                            return i4 + 705;
                        }
                        if (str.equals("EXCEPTION_UNIT_BIDDING_TYPE_ERROR")) {
                            return i4 + 706;
                        }
                        if (str.equals("No video campaign")) {
                            return i4 + 707;
                        }
                        if (str.equals("EXCEPTION_RETURN_EMPTY")) {
                            return i4 + 708;
                        }
                        if (str.equals("EXCEPTION_APP_PLATFORM_ERROR")) {
                            return i4 + 709;
                        }
                        if (str.equals("EXCEPTION_SERVICE_REQUEST_OS_VERSION_REQUIRED")) {
                            return i4 + 710;
                        }
                        if (str.equals(com.anythink.expressad.mbbanner.a.a.f19970c)) {
                            return i4 + 801;
                        }
                        if (str.equals("resource load timeout is tpl: false")) {
                            return i4 + com.anythink.expressad.video.dynview.a.a.f21278s;
                        }
                        if (str.startsWith("resource download failed")) {
                            return i4 + 803;
                        }
                        if (str.equals("temp preload success but isReady false")) {
                            return i4 + 804;
                        }
                        if (str.equals("temp resource download failed")) {
                            return i4 + 805;
                        }
                        if (str.equals("tpl temp resource download failed")) {
                            return i4 + 806;
                        }
                        if (str.equals("resource load timeout is tpl: true")) {
                            return i4 + 807;
                        }
                        if (!str.startsWith("https://") && !str.startsWith("http://")) {
                            if (str.equals("mraid resource write fail")) {
                                return i4 + 809;
                            }
                            if (str.startsWith("data save failed:")) {
                                return i4 + 810;
                            }
                            if (str.equals("resource load timeout")) {
                                return i4 + 811;
                            }
                            if (str.startsWith("tpl temp preload failed")) {
                                return i4 + 812;
                            }
                        }
                        return i4 + 808;
                    }
                    return i4 + 703;
                }
                return i4 + 604;
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        return i4;
    }
}
