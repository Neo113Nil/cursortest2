package defpackage;

import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class rm7 implements msd {
    public final /* synthetic */ int a;
    public final View b;

    public /* synthetic */ rm7(View view, int i) {
        this.a = i;
        this.b = view;
    }

    @Override // defpackage.msd
    public final void a(int i) {
        switch (this.a) {
            case 0:
                View view = this.b;
                if (i != 16) {
                    if (i != 6) {
                        if (i != 13) {
                            if (i != 23) {
                                if (i != 0) {
                                    if (i != 17) {
                                        if (i != 27) {
                                            if (i != 26) {
                                                if (i != 9) {
                                                    if (i != 22) {
                                                        if (i != 21) {
                                                            if (i == 1) {
                                                                view.performHapticFeedback(1);
                                                                break;
                                                            }
                                                        } else {
                                                            view.performHapticFeedback(21);
                                                            break;
                                                        }
                                                    } else {
                                                        view.performHapticFeedback(22);
                                                        break;
                                                    }
                                                } else {
                                                    view.performHapticFeedback(9);
                                                    break;
                                                }
                                            } else {
                                                view.performHapticFeedback(26);
                                                break;
                                            }
                                        } else {
                                            view.performHapticFeedback(27);
                                            break;
                                        }
                                    } else {
                                        view.performHapticFeedback(17);
                                        break;
                                    }
                                } else {
                                    view.performHapticFeedback(0);
                                    break;
                                }
                            } else {
                                view.performHapticFeedback(23);
                                break;
                            }
                        } else {
                            view.performHapticFeedback(13);
                            break;
                        }
                    } else {
                        view.performHapticFeedback(6);
                        break;
                    }
                } else {
                    view.performHapticFeedback(16);
                    break;
                }
                break;
            default:
                AndroidComposeView androidComposeView = (AndroidComposeView) this.b;
                if (i != 16) {
                    if (i != 6) {
                        if (i != 13) {
                            if (i != 23) {
                                if (i != 0) {
                                    if (i != 17) {
                                        if (i != 27) {
                                            if (i != 26) {
                                                if (i != 9) {
                                                    if (i != 22) {
                                                        if (i != 21) {
                                                            if (i == 1) {
                                                                androidComposeView.performHapticFeedback(1);
                                                                break;
                                                            }
                                                        } else {
                                                            androidComposeView.performHapticFeedback(21);
                                                            break;
                                                        }
                                                    } else {
                                                        androidComposeView.performHapticFeedback(22);
                                                        break;
                                                    }
                                                } else {
                                                    androidComposeView.performHapticFeedback(9);
                                                    break;
                                                }
                                            } else {
                                                androidComposeView.performHapticFeedback(26);
                                                break;
                                            }
                                        } else {
                                            androidComposeView.performHapticFeedback(27);
                                            break;
                                        }
                                    } else {
                                        androidComposeView.performHapticFeedback(17);
                                        break;
                                    }
                                } else {
                                    androidComposeView.performHapticFeedback(0);
                                    break;
                                }
                            } else {
                                androidComposeView.performHapticFeedback(23);
                                break;
                            }
                        } else {
                            androidComposeView.performHapticFeedback(13);
                            break;
                        }
                    } else {
                        androidComposeView.performHapticFeedback(6);
                        break;
                    }
                } else {
                    androidComposeView.performHapticFeedback(16);
                    break;
                }
                break;
        }
    }
}
